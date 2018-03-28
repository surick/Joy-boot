package com.joy.modules.demo.entity;

import com.joy.modules.activiti.annotation.ActField;
import com.joy.modules.activiti.annotation.ActTable;
import com.joy.modules.common.entity.ActivitiBaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 项目报销实体类
 *
 * @author w24164
 * @create 2018-03-23 14:57
 */
@ActTable(tableName = "bxaply",pkName="id")
public class BxEntity extends ActivitiBaseEntity{
    private String id;

    private String userId;

    @ActField(name = "项目事由")
    @NotEmpty(message = "项目事由不能为空")
    private String title;

    @NotEmpty(message = "办公费不能为空")
    @ActField(name = "办公费",isJudg = true)
    private int bgf;

    @NotEmpty(message = "材料费不能为空")
    @ActField(name = "材料费",isJudg = true)
    private int clf;

    /**
     * 报销原因
     */
    @NotEmpty(message = "原因不能为空")
    private String baoxiaowhy;

    /**
     * 发票单据
     */
    @NotEmpty(message = "发票单据不能为空")
    private byte[] fp;
    private byte[] fp1;
    private byte[] fp2;

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


    public byte[] getFp() {
        return fp;
    }

    public void setFp(byte[] fp) {
        this.fp = fp;
    }

    public int getBgf() {
        return bgf;
    }

    public void setBgf(int bgf) {
        this.bgf = bgf;
    }

    public int getClf() {
        return clf;
    }

    public void setClf(int clf) {
        this.clf = clf;
    }

    public byte[] getFp1() {
        return fp1;
    }

    public void setFp1(byte[] fp1) {
        this.fp1 = fp1;
    }

    public byte[] getFp2() {
        return fp2;
    }

    public void setFp2(byte[] fp2) {
        this.fp2 = fp2;
    }
}
