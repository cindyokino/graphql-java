package com.codeboxx.rocketelevatorsgraphqljava.repository;

import com.codeboxx.rocketelevatorsgraphqljava.entity.Elevators;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElevatorsRepository extends JpaRepository<Elevators, Long> {
    List<Elevators> findElevatorsByStatusIsNot(String status);
}
