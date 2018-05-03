package com.joy.modules.demo.service.impl;

import com.joy.modules.demo.dao.SumDao;
import com.joy.modules.demo.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sumService")
public class SumServiceImpl implements SumService {
    @Autowired
    private SumDao sumDao;

    @Override
    public void sum(String defid,String tablename) {
        sumDao.sum(defid, tablename);
    }
}
