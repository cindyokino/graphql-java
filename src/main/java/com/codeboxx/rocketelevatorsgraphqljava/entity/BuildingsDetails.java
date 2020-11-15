package com.codeboxx.rocketelevatorsgraphqljava.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "buildings_details", schema = "Rocket_Elevators_Information_System_development", catalog = "")
public class BuildingsDetails {
    @Id
    private Long id;
    private String infoKey;
    private String value;
}
