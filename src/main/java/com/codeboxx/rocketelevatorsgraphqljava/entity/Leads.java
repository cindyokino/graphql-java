package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Data
public class Leads {
    @Id
    private long id;
    private String fullName;
    private String companyName;
    private String email;
    private String phoneNumber;
    private String projectName;
    private String projectDescription;
    private String department;
    private String message;
    private byte[] attachedFile;
    private Date createAt;
    private String nameAttachedFile;
}
