package de.htwberlin.ohdm.lod.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ggrauberger on 07.11.17.
 */
@Entity
@Table(name = "\"myGO\"")
public class GeoObject {
    @Id
    private String name;
    private String geom;
    public GeoObject() {
        //nop
    }
    public GeoObject(String name, String geom){
        this.name = name;
        this.geom = geom;
    }

    @Override
    public String toString(){
        return String.format("GeoObject:[name:%s, geom:%s]", name, geom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }
}
