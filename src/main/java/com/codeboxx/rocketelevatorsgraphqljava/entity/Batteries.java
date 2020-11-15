package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Batteries {
    @Id
    private Long id;
    private String typeBuilding;
    private String status;
    private Date dateCommissioning;
    private Date dateLastInspection;
    private String certOpe;
    private String information;
    private String notes;
}
