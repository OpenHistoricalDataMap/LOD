package de.htwberlin.ohdm.lod.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ggrauberger on 07.11.17.
 */
@Entity
@Table(name = "geoobject")
public class GeoObject {
    @Id
    private Long id;
    private String name;
    private Long source_user_id;

    public GeoObject() {
    }

    @Override
    public String toString() {
        return String.format("GeoObject:[id:%d, name:%s]", id, name);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSource_user_id() {
        return source_user_id;
    }
}
