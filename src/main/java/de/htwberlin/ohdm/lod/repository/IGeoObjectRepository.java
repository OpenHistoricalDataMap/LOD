package de.htwberlin.ohdm.lod.repository;

import de.htwberlin.ohdm.lod.model.GeoObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by ggrauberger on 07.11.17.
 */

public interface IGeoObjectRepository extends ReadOnlyRepository<GeoObject, Long> {
    @Query(value = "SELECT " +
            "geometry.id, " +
            "geoobject.name, " +
            "to_char(geometry.valid_since, 'YYYY-MM-DD') as valid_since," +
            "to_char(geometry.valid_until, 'YYYY-MM-DD') as valid_until," +
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

    @Query(value = "SELECT " +
            "geometry.id, " +
            "geoobject.name, " +
            "to_char(geometry.valid_since, 'YYYY-MM-DD') as valid_since," +
            "to_char(geometry.valid_until, 'YYYY-MM-DD') as valid_until," +
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
            "ORDER BY ?#{#pageable}",
           countQuery = "SELECT count(*)" +
                   "FROM ohdm.geoobject_geometry geometry ORDER BY ?#{#pageable}",
           nativeQuery = true)
    Page<GeoObject> findAll(Pageable pageable);
}
