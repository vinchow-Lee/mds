package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "agent")
public class Agent implements Serializable {
    /**
     * 经销商ID
     */
    @Id
    @Column(name = "agent_id")
    @GeneratedValue(generator = "JDBC")
    private Integer agentId;

    /**
     * 经销商手机号
     */
    @Column(name = "agent_phone")
    private String agentPhone;

    /**
     * 经销商用户名
     */
    @Column(name = "agent_username")
    private String agentUsername;

    /**
     * 经销商账号密码
     */
    @Column(name = "agent_password")
    private String agentPassword;

    /**
     * 经销商收货关联id
     */
    @Column(name = "agent_addr_id")
    private Integer agentAddrId;

    /**
     * 经销商头像地址
     */
    @Column(name = "agent_imgUrl")
    private String agentImgurl;

    /**
     * 经销商授权码
     */
    @Column(name = "agent_authenticateCode")
    private String agentAuthenticatecode;

    /**
     * 经销商地区
     */
    @Column(name = "agent_area")
    private String agentArea;

    /**
     * 经销商钱包
     */
    @Column(name = "agent_balance")
    private BigDecimal agentBalance;

    /**
     * 经销商代理级别
     */
    @Column(name = "agent_level")
    private Integer agentLevel;

    /**
     * 经销商上级ID
     */
    @Column(name = "agent_superiorID")
    private Integer agentSuperiorid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取经销商ID
     *
     * @return agent_id - 经销商ID
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * 设置经销商ID
     *
     * @param agentId 经销商ID
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取经销商手机号
     *
     * @return agent_phone - 经销商手机号
     */
    public String getAgentPhone() {
        return agentPhone;
    }

    /**
     * 设置经销商手机号
     *
     * @param agentPhone 经销商手机号
     */
    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    /**
     * 获取经销商用户名
     *
     * @return agent_username - 经销商用户名
     */
    public String getAgentUsername() {
        return agentUsername;
    }

    /**
     * 设置经销商用户名
     *
     * @param agentUsername 经销商用户名
     */
    public void setAgentUsername(String agentUsername) {
        this.agentUsername = agentUsername;
    }

    /**
     * 获取经销商账号密码
     *
     * @return agent_password - 经销商账号密码
     */
    public String getAgentPassword() {
        return agentPassword;
    }

    /**
     * 设置经销商账号密码
     *
     * @param agentPassword 经销商账号密码
     */
    public void setAgentPassword(String agentPassword) {
        this.agentPassword = agentPassword;
    }

    /**
     * 获取经销商收货关联id
     *
     * @return agent_addr_id - 经销商收货关联id
     */
    public Integer getAgentAddrId() {
        return agentAddrId;
    }

    /**
     * 设置经销商收货关联id
     *
     * @param agentAddrId 经销商收货关联id
     */
    public void setAgentAddrId(Integer agentAddrId) {
        this.agentAddrId = agentAddrId;
    }

    /**
     * 获取经销商头像地址
     *
     * @return agent_imgUrl - 经销商头像地址
     */
    public String getAgentImgurl() {
        return agentImgurl;
    }

    /**
     * 设置经销商头像地址
     *
     * @param agentImgurl 经销商头像地址
     */
    public void setAgentImgurl(String agentImgurl) {
        this.agentImgurl = agentImgurl;
    }

    /**
     * 获取经销商授权码
     *
     * @return agent_authenticateCode - 经销商授权码
     */
    public String getAgentAuthenticatecode() {
        return agentAuthenticatecode;
    }

    /**
     * 设置经销商授权码
     *
     * @param agentAuthenticatecode 经销商授权码
     */
    public void setAgentAuthenticatecode(String agentAuthenticatecode) {
        this.agentAuthenticatecode = agentAuthenticatecode;
    }

    /**
     * 获取经销商地区
     *
     * @return agent_area - 经销商地区
     */
    public String getAgentArea() {
        return agentArea;
    }

    /**
     * 设置经销商地区
     *
     * @param agentArea 经销商地区
     */
    public void setAgentArea(String agentArea) {
        this.agentArea = agentArea;
    }

    /**
     * 获取经销商钱包
     *
     * @return agent_balance - 经销商钱包
     */
    public BigDecimal getAgentBalance() {
        return agentBalance;
    }

    /**
     * 设置经销商钱包
     *
     * @param agentBalance 经销商钱包
     */
    public void setAgentBalance(BigDecimal agentBalance) {
        this.agentBalance = agentBalance;
    }

    /**
     * 获取经销商代理级别
     *
     * @return agent_level - 经销商代理级别
     */
    public Integer getAgentLevel() {
        return agentLevel;
    }

    /**
     * 设置经销商代理级别
     *
     * @param agentLevel 经销商代理级别
     */
    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }

    /**
     * 获取经销商上级ID
     *
     * @return agent_superiorID - 经销商上级ID
     */
    public Integer getAgentSuperiorid() {
        return agentSuperiorid;
    }

    /**
     * 设置经销商上级ID
     *
     * @param agentSuperiorid 经销商上级ID
     */
    public void setAgentSuperiorid(Integer agentSuperiorid) {
        this.agentSuperiorid = agentSuperiorid;
    }
}