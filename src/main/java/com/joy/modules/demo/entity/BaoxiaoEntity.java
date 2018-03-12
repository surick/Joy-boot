package com.joy.modules.demo.entity;

import com.joy.modules.activiti.annotation.ActField;
import com.joy.modules.activiti.annotation.ActTable;
import com.joy.modules.common.entity.ActivitiBaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 报销demo
 *
 * @author w24164
 * @create 2018-03-12 16:10
 */
@ActTable(tableName = "baoxiaoaply",pkName="id")
public class BaoxiaoEntity extends ActivitiBaseEntity {
    private String id;

    private String userId;

    @ActField(name = "报销标题")
    @NotEmpty(message = "报销标题不能为空")
    private String title;

    @NotEmpty(message = "报销金额不能为空")
    @ActField(name = "报销金额",isJudg = true)
    private int money;

    /**
     * 报销原因
     */
    @NotEmpty(message = "报销原因不能为空")
    private String baoxiaowhy;

    /**
     * 发票单据
     */
    @NotEmpty(message = "发票单据不能为空")
    private byte[] fapiao;

    /**
     * 报销人姓名
     */
    private String baoxiaoUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getBaoxiaowhy() {
        return baoxiaowhy;
    }

    public void setBaoxiaowhy(String baoxiaowhy) {
        this.baoxiaowhy = baoxiaowhy;
    }

    public String getBaoxiaoUser() {
        return baoxiaoUser;
    }

    public void setBaoxiaoUser(String baoxiaoUser) {
        this.baoxiaoUser = baoxiaoUser;
    }

    public byte[] getFapiao() {
        return fapiao;
    }

    public void setFapiao(byte[] fapiao) {
        this.fapiao = fapiao;
    }
}
