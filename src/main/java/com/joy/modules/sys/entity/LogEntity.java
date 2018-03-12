package com.joy.modules.sys.entity;

import java.util.Date;

public class LogEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.ID
     *编号
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.TYPE
     *日志类型 1：系统类型
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.TITLE
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.CREATE_BY
     *创建者
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.CREATE_DATE
     *创建时间
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.REMOTE_ADDR
     *操作Ip
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String remoteAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.USER_AGENT
     *用户代理
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String userAgent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.REQUEST_URL
     *请求url
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String requestUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.METHOD
     *操作方式
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String method;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.PARAMS
     * 操作提交的数据
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String params;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.EXCEPTION
     *异常信息
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    private String exception;

    /**
     * 创建人名字
     */
    private String createName;

    /**
     * 创建开始时间
     */
    private String startCreateDate;

    /**
     * 创建结束时间
     */
    private String endCreateDate;

    public String getStartCreateDate() {
        return startCreateDate;
    }

    public void setStartCreateDate(String startCreateDate) {
        this.startCreateDate = startCreateDate;
    }

    public String getEndCreateDate() {
        return endCreateDate;
    }

    public void setEndCreateDate(String endCreateDate) {
        this.endCreateDate = endCreateDate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.ID
     *
     * @return the value of SYS_LOG.ID
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.ID
     *
     * @param id the value for SYS_LOG.ID
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.TYPE
     *
     * @return the value of SYS_LOG.TYPE
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.TYPE
     *
     * @param type the value for SYS_LOG.TYPE
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.TITLE
     *
     * @return the value of SYS_LOG.TITLE
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.TITLE
     *
     * @param title the value for SYS_LOG.TITLE
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.CREATE_BY
     *
     * @return the value of SYS_LOG.CREATE_BY
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.CREATE_BY
     *
     * @param createBy the value for SYS_LOG.CREATE_BY
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.REMOTE_ADDR
     *
     * @return the value of SYS_LOG.REMOTE_ADDR
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.REMOTE_ADDR
     *
     * @param remoteAddr the value for SYS_LOG.REMOTE_ADDR
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.USER_AGENT
     *
     * @return the value of SYS_LOG.USER_AGENT
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.USER_AGENT
     *
     * @param userAgent the value for SYS_LOG.USER_AGENT
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.REQUEST_URL
     *
     * @return the value of SYS_LOG.REQUEST_URL
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.REQUEST_URL
     *
     * @param requestUrl the value for SYS_LOG.REQUEST_URL
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.METHOD
     *
     * @return the value of SYS_LOG.METHOD
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.METHOD
     *
     * @param method the value for SYS_LOG.METHOD
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.PARAMS
     *
     * @return the value of SYS_LOG.PARAMS
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.PARAMS
     *
     * @param params the value for SYS_LOG.PARAMS
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.EXCEPTION
     *
     * @return the value of SYS_LOG.EXCEPTION
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public String getException() {
        return exception;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.EXCEPTION
     *
     * @param exception the value for SYS_LOG.EXCEPTION
     *
     * @mbg.generated Thu Mar 16 11:23:28 CST 2017
     */
    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }
}