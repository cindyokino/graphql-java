package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
@Data
public class Elevators {
    @Id
    private long id;
    private String serialNumber;
    private String model;
    private String typeBuilding;
    private String status;
    private Date dateCommissioning;
    private Date dateLastInspection;
    private String certOpe;
    private String information;
}
