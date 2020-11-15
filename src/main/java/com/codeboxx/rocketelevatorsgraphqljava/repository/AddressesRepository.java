package com.codeboxx.rocketelevatorsgraphqljava.repository;

import com.codeboxx.rocketelevatorsgraphqljava.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<Addresses, Long> {
}
