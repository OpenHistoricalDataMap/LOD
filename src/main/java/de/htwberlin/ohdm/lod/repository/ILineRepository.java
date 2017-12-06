package de.htwberlin.ohdm.lod.Repositories;

import de.htwberlin.ohdm.lod.Models.Line;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ggrauberger on 09.11.17.
 */
public interface ILineRepository extends CrudRepository<Line, Long>{
    public Line getLineById(Long id);
}
