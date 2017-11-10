package de.htwberlin.ohdm.lod.Repositories;

import de.htwberlin.ohdm.lod.Models.Point;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ggrauberger on 09.11.17.
 */

public interface IPointRepository extends CrudRepository<Point, Long> {
    public Point getById(Long id);
}
