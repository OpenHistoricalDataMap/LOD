package de.htwberlin.ohdm.lod.repository;

import de.htwberlin.ohdm.lod.model.Point;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ggrauberger on 09.11.17.
 */

public interface IPointRepository extends ReadOnlyRepository<Point, Long> {
}
