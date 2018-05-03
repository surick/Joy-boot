package com.joy.modules.demo.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SumDao {
    void sum(String defid,String tablename);
}
