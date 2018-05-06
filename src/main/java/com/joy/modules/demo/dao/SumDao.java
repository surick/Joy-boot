package com.joy.modules.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SumDao {
    void sum(Map<String, String> map);
    void sum_bx(Map<String,String> map);
}
