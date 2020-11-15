package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
public class Columns {
    @Id
    private Long id;
    private String typeBuilding;
    private Integer amountFloorsServed;
    private String status;
    private String information;
    private String notes;

}
