package de.htwberlin.ohdm.lod.model;

import javax.persistence.*;

/**
 * Created by ggrauberger on 09.11.17.
 */

@Entity
@Table(name = "polygons")
public class Polygon {
    @Id
    private Long id;
    private String polygon;
    private Long source_user_id;

    public Polygon() {
        super();
    }

    public String getPolygon() {
        return polygon;
    }

    public Long getId() {
        return id;
    }

    public Long getSource_user_id() {
        return source_user_id;
    }
}
