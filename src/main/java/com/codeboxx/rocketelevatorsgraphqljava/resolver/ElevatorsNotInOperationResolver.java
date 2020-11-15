package com.codeboxx.rocketelevatorsgraphqljava.resolver;

import com.codeboxx.rocketelevatorsgraphqljava.entity.Elevators;
import com.codeboxx.rocketelevatorsgraphqljava.repository.ElevatorsRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ElevatorsNotInOperationResolver implements GraphQLQueryResolver {

    @Autowired
    private ElevatorsRepository elevatorsRepository;
    public List<Elevators> listOfElevatorsNotInOperation() {
        return elevatorsRepository.findElevatorsByStatusIsNot("online");
    }
}



