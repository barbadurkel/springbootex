package com.example.springbootwebapp.dao;

import com.example.springbootwebapp.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> db = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id, person.getName()));
        return 0;
    }
}
