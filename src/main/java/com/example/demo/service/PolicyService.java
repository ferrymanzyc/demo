package com.example.demo.service;

import com.example.demo.dao.Policydao;
import com.example.demo.pojo.Name;
import com.example.demo.pojo.Policylist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    Policydao policydao;

    public List<Name> findAll(){
        return (List<Name>) policydao.findAll();
    }

    public List<Name> findByName(String name){
        return policydao.findByName(name);
    }
}
