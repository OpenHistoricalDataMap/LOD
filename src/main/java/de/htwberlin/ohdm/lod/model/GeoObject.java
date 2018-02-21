package de.htwberlin.ohdm.lod.model;

import com.fasterxml.jackson.annotation.JsonRawValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ggrauberger on 07.11.17.
 */
@Entity
public class GeoObject {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "geometry")
    private String geometry;

    @Column(name = "source_user_id")
    private Long userId;

    @Column(name = "valid_since")
    private String validSince;

    @Column(name = "valid_until")
    private String validUntil;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    @JsonRawValue
    public String getGeometry() {
        return geometry;
    }

    public String getValidSince() { return validSince; }

    public String getValidUntil() { return validUntil; }
}
