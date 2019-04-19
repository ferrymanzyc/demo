package com.example.demo.controller;


import com.example.demo.dao.HumanRepository;
import com.example.demo.pojo.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.annotations.DynamicTemplates;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/human")
public class HumanController {

    @Autowired
    HumanRepository humanRepository;

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Human queryHumanById(@PathVariable Integer id){
        return humanRepository.queryHumanById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addHuman(@RequestBody Human human){
        humanRepository.save(human);
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public void createIndex(){
        elasticsearchTemplate.createIndex(Human.class);
    }

}
