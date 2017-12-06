package de.htwberlin.ohdm.lod.repository;

import de.htwberlin.ohdm.lod.model.GeoObject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ggrauberger on 07.11.17.
 */
public interface IGeoObjectRepository extends CrudRepository<GeoObject, Long> {
    @Query(value = "SELECT " +
            "geometry.id, " +
            "geoobject.name, " +
            "st_asgeojson(" +
            "  CASE " +
            "  WHEN geometry.type_target = 1 " +
            "    THEN lines.line " +
            "  WHEN geometry.type_target = 2 " +
            "    THEN points.point " +
            "  WHEN geometry.type_target = 3 " +
            "    THEN polygons.polygon  END) as geometry, " +
            "geoobject.source_user_id " +
            "FROM ohdm.geoobject_geometry geometry " +
            "  JOIN ohdm.geoobject geoobject ON geoobject.id = geometry.id_geoobject_source " +
            "  JOIN ohdm.lines lines ON lines.id = geometry.id_target " +
            "  JOIN ohdm.points points ON points.id = geometry.id_target " +
            "  JOIN ohdm.polygons polygons ON polygons.id = geometry.id_target " +
            "WHERE geometry.id = ?1 LIMIT 1;", nativeQuery = true)
    @Override
    GeoObject findOne(Long id);
}
