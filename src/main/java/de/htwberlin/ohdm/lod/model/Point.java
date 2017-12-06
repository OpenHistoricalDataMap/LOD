package de.htwberlin.ohdm.lod.model;

import com.vividsolutions.jts.geom.Geometry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ggrauberger on 09.11.17.
 */
@Entity
@Table(name = "points")
public class Point {
    @Id
    private Long id;
    private Geometry point;
    private Long source_user_id;

    public Point() {
    }

    public Geometry getPoint() {
        return point;
    }

    public Long getId() {
        return id;
    }

    public Long getSource_user_id() {
        return source_user_id;
    }
}
