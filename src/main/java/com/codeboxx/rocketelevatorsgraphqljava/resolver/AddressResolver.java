package com.codeboxx.rocketelevatorsgraphqljava.resolver;

import com.codeboxx.rocketelevatorsgraphqljava.entity.*;
import com.codeboxx.rocketelevatorsgraphqljava.repository.*;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressResolver implements GraphQLQueryResolver {

    @Autowired
    private AddressesRepository addressesRepository;
    public Addresses address(Long id) {
        return addressesRepository.findById(id).orElse(null);
    }
}



