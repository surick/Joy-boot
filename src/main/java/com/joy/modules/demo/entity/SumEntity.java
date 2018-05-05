package com.joy.modules.demo.entity;

import com.joy.modules.common.entity.ActivitiBaseEntity;

public class SumEntity extends ActivitiBaseEntity {
    private String defid;
    private String tablename;

    @Override
    public String getDefid() {
        return defid;
    }

    @Override
    public void setDefid(String defid) {
        this.defid = defid;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}
