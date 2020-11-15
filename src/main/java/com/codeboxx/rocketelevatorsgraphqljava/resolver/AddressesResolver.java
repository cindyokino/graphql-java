package com.codeboxx.rocketelevatorsgraphqljava.resolver;

import com.codeboxx.rocketelevatorsgraphqljava.entity.Addresses;
import com.codeboxx.rocketelevatorsgraphqljava.repository.AddressesRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressesResolver implements GraphQLQueryResolver {

    @Autowired
    private AddressesRepository addressesRepository;
    public List<Addresses> addresses() {
        return addressesRepository.findAll();
    }
}



