package com.codeboxx.rocketelevatorsgraphqljava.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
public class Users {
    @Id
    private Long id;
    private String email;
    private String encryptedPassword;
    private String resetPasswordToken;
    private Timestamp resetPasswordSentAt;
    private Timestamp rememberCreatedAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
