package com.example.demo.controller;

import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/findAll")
    public List<Person> findAll(){
        return personService.findAllPerson();
    }

    @RequestMapping(value = "/findById/{id}" , method = RequestMethod.GET)
    public  Person findById(@PathVariable Integer id){
        return personService.findById(id);
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public @ResponseBody void savePerson(@RequestBody Person person){
        personService.save(person);
    }
}
