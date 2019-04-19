package com.example.demo.dao;

import com.example.demo.pojo.Human;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface HumanRepository extends ElasticsearchRepository<Human, Integer> {

    Human queryHumanById(Integer id);
}
