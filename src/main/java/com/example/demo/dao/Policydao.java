package com.example.demo.dao;

import com.example.demo.pojo.Name;
import com.example.demo.pojo.Policylist;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface Policydao extends PagingAndSortingRepository<Name, String> {

    public List<Name> findByName(String name);

}
