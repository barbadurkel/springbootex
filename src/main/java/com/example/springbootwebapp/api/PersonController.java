package com.example.springbootwebapp.api;

import com.example.springbootwebapp.model.Person;
import com.example.springbootwebapp.service.PersonService;

public class PersonController {

    // api (controller) -> service -> dao -> model (BD)

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
