package com.example.demo.dao;


import com.example.demo.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Object> {

    Person findById(Integer id);

}
