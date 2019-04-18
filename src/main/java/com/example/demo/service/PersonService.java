package com.example.demo.service;


import com.example.demo.dao.PersonDao;
import com.example.demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public List<Person> findAllPerson(){
        return personDao.findAll();
    }

    public Person findById(Integer id) {
        return personDao.findById(id);
    }

    public void save(Person person) {
        personDao.save(person);
    }
}
