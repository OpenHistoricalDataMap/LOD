package de.htwberlin.ohdm.lod.Repositories;

import de.htwberlin.ohdm.lod.Models.Polygon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ggrauberger on 09.11.17.
 */
public interface IPolygonRepository extends PagingAndSortingRepository<Polygon, Long> {
    public Polygon findById(Long id);
    Page<Polygon> findAll(Pageable pageable);
}
