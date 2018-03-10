package de.htwberlin.ohdm.lod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExternalUser {
    @Id
    private Long id;

    @Column(name = "userid")
    private Long userid;

    @Column(name = "username")
    private String username;

    @Column(name = "external_system_id")
    private Long externalSystemId;
}
