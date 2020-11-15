package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
public class Buildings {
    @Id
    private Long id;
    private String admContactName;
    private String admContactMail;
    private String admContactPhone;
    private String tectContactName;
    private String tectContactEmail;
    private String tectContactPhone;
}
