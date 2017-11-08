package de.htwberlin.ohdm.lod.Repositories;

import de.htwberlin.ohdm.lod.Models.GeoObject;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ggrauberger on 07.11.17.
 */
public interface IGeoObjectRepository extends CrudRepository<GeoObject, String> {
    GeoObject findByName(String name);
}
