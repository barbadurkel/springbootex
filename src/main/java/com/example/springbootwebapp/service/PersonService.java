package com.example.springbootwebapp.service;

import com.example.springbootwebapp.dao.PersonDao;
import com.example.springbootwebapp.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

}
