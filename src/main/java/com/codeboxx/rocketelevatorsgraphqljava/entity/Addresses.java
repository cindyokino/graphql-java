package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
public class Addresses {
    @Id
    private Long id;
    private String typeAddress;
    private String status;
    private String entite;
    private String address;
    private String address2;
    private String city;
    private String postalCode;
    private String country;
    private String notes;
    private Double latitude;
    private Double longitude;
    private String fullStreetAddress;
}
