package com.example.demo.controller;

import com.example.demo.pojo.Name;
import com.example.demo.pojo.Policylist;
import com.example.demo.service.PolicyService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("hello")
    public String test(){
        return "i love java";
    }

    @Autowired
    PolicyService policyService;

    @GetMapping("findAll")
    public List<Name> findAll(){
        return policyService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "findByName" , method = RequestMethod.GET)
    public List<Name> findByName( String name){
        return policyService.findByName(name);
    }
}
