package de.htwberlin.ohdm.lod.repository;

import de.htwberlin.ohdm.lod.model.Polygon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ggrauberger on 09.11.17.
 */
public interface IPolygonRepository extends ReadOnlyRepository<Polygon, Long> {
}
