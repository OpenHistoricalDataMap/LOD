package de.htwberlin.ohdm.lod.repository;

import de.htwberlin.ohdm.lod.model.Line;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ggrauberger on 09.11.17.
 */
public interface ILineRepository extends CrudRepository<Line, Long>{
    public Line getLineById(Long id);
}
