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
public class Quotes {
    @Id
    private Long id;
    private String companyName;
    private String buildingType;
    private Integer appsQty;
    private Integer floorsQty;
    private Integer basementsQty;
    private Integer parkingsQty;
    private Integer elevatorsQty;
    private Integer businessQty;
    private Integer occupantsFloorsQty;
    private Integer hoursActivity;
    private String game;
    private Integer elevatorNeeded;
    private Integer totalPrice;
    private String email;
    private Date createAt;
}
