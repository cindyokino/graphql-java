# graphql-java

The project is still in progress...
This is a Java GraphQL API to retrieve informations about Rocket Elevators

## You can try only these 3 querys for now (retrieve data from MySQL database):
query getAddressById{
  address(id: 1){
    city
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
