package com.example.secondspringboot.dao;

import com.example.secondspringboot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    // insert a Person without a given Id (randomly generated)
    // default was added in Java 8 : https://stackoverflow.com/questions/31578427/what-is-the-purpose-of-the-default-keyword-in-java
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    // Java 8 Optional : A container object which may or may not contain a non-null value
    // isPresent() => true/false , get() -> returns the actual value
    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);


}