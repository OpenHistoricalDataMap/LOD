package de.htwberlin.ohdm.lod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subsequent_geom_user")
public class SubsequentGeomUser {
    @Id
    private Long id;

    @Column(name = "target_id")
    private Long targetId;

    @Column(name = "point_id")
    private Long pointId;

    @Column(name = "line_id")
    private Long lineId;

    @Column(name = "polygon_id")
    private Long polygonId;
}
