# graphql-java

The project is still in progress...
This is a Java GraphQL API to retrieve informations about Rocket Elevators

### Heroku Link:
https://graphql-java-rocket-elevators.herokuapp.com/playground

### You can try only these 3 querys for now (retrieve data from MySQL database):
```
query getAddressById{
  address(id: 1){
    id
    typeAddress
    status
    entite
    city
    postalCode
    country
    fullStreetAddress
    notes
  } 
}

query getAllTAddresses{
  addresses{
    city
  } 
}

query listOfElevatorsNotInOperation{
  listOfElevatorsNotInOperation{
    id
    status
    serialNumber
    model
    typeBuilding
    dateLastInspection
  }
}
```

### Reference:
- https://github.com/philip-jvm/learn-spring-boot-graphql/blob/master/pom.xml
- https://github.com/graphql-java-kickstart/graphql-spring-boot
- https://www.jetbrains.com/help/idea/2016.1/generating-persistence-mappings.html
- https://spring.io/guides/gs/accessing-data-mysql/
- https://stackoverflow.com/questions/60561070/springboot-connection-to-rds-throws-exception-caused-by-java-security-cert-cer - to solve Heroku Deploy problem

