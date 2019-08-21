package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "customer_point_log")
public class CustomerPointLog implements Serializable {
    /**
     * 积分日志ID
     */
    @Id
    @Column(name = "cpl_id")
    @GeneratedValue(generator = "JDBC")
    private Integer cplId;

    /**
     * 用户ID
     */
    @Column(name = "cpl_customer_id")
    private Integer cplCustomerId;

    /**
     * 积分来源：0订单，1登陆，2活动
     */
    @Column(name = "cpl_source")
    private Byte cplSource;

    /**
     * 积分来源相关编号
     */
    @Column(name = "cpl_refer_number")
    private Integer cplReferNumber;

    /**
     * 变更积分数
     */
    @Column(name = "cpl_change_point")
    private Short cplChangePoint;

    /**
     * 积分日志生成时间
     */
    @Column(name = "cpl_create_time")
    private Date cplCreateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取积分日志ID
     *
     * @return cpl_id - 积分日志ID
     */
    public Integer getCplId() {
        return cplId;
    }

    /**
     * 设置积分日志ID
     *
     * @param cplId 积分日志ID
     */
    public void setCplId(Integer cplId) {
        this.cplId = cplId;
    }

    /**
     * 获取用户ID
     *
     * @return cpl_customer_id - 用户ID
     */
    public Integer getCplCustomerId() {
        return cplCustomerId;
    }

    /**
     * 设置用户ID
     *
     * @param cplCustomerId 用户ID
     */
    public void setCplCustomerId(Integer cplCustomerId) {
        this.cplCustomerId = cplCustomerId;
    }

    /**
     * 获取积分来源：0订单，1登陆，2活动
     *
     * @return cpl_source - 积分来源：0订单，1登陆，2活动
     */
    public Byte getCplSource() {
        return cplSource;
    }

    /**
     * 设置积分来源：0订单，1登陆，2活动
     *
     * @param cplSource 积分来源：0订单，1登陆，2活动
     */
    public void setCplSource(Byte cplSource) {
        this.cplSource = cplSource;
    }

    /**
     * 获取积分来源相关编号
     *
     * @return cpl_refer_number - 积分来源相关编号
     */
    public Integer getCplReferNumber() {
        return cplReferNumber;
    }

    /**
     * 设置积分来源相关编号
     *
     * @param cplReferNumber 积分来源相关编号
     */
    public void setCplReferNumber(Integer cplReferNumber) {
        this.cplReferNumber = cplReferNumber;
    }

    /**
     * 获取变更积分数
     *
     * @return cpl_change_point - 变更积分数
     */
    public Short getCplChangePoint() {
        return cplChangePoint;
    }

    /**
     * 设置变更积分数
     *
     * @param cplChangePoint 变更积分数
     */
    public void setCplChangePoint(Short cplChangePoint) {
        this.cplChangePoint = cplChangePoint;
    }

    /**
     * 获取积分日志生成时间
     *
     * @return cpl_create_time - 积分日志生成时间
     */
    public Date getCplCreateTime() {
        return cplCreateTime;
    }

    /**
     * 设置积分日志生成时间
     *
     * @param cplCreateTime 积分日志生成时间
     */
    public void setCplCreateTime(Date cplCreateTime) {
        this.cplCreateTime = cplCreateTime;
    }
}