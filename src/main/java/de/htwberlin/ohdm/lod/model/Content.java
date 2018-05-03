package de.htwberlin.ohdm.lod.model;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Content {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private Byte value;

    @Column(name = "mimetype")
    private String mimetype;

    @Column(name = "source_user")
    private Long sourceUser;
}
