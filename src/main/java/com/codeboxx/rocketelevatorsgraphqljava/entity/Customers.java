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
public class Customers {
    @Id
    private Long id;
    private Date dateCreate;
    private String companyName;
    private String cpyContactName;
    private String cpyContactPhone;
    private String cpyContactEmail;
    private String cpyDescription;
    private String staName;
    private String staPhone;
    private String staMail;
}
