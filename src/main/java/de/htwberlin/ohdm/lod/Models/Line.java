package de.htwberlin.ohdm.lod.Models;

import com.vividsolutions.jts.geom.Geometry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ggrauberger on 09.11.17.
 */
@Entity
@Table(name = "lines")
public class Line {
    @Id
    private Long id;
    private Long source_user_id;
    private Geometry line;

    public Line() {
        super();
    }

    public Geometry getLine() {
        return line;
    }

    public Long getId() {
        return id;
    }

    public Long getSource_user_id() {
        return source_user_id;
    }
}
