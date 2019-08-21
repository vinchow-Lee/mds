package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "customer_present_log")
public class CustomerPresentLog implements Serializable {
    /**
     * 兑换历史ID
     */
    @Id
    @Column(name = "cpl_id")
    @GeneratedValue(generator = "JDBC")
    private Integer cplId;

    /**
     * 消费者ID
     */
    @Column(name = "cpl_customer_id")
    private Integer cplCustomerId;

    /**
     * 积分商品ID
     */
    @Column(name = "cpl_present_id")
    private Integer cplPresentId;

    /**
     * 兑换的数量
     */
    @Column(name = "cpl_count")
    private Integer cplCount;

    /**
     * 消耗积分
     */
    @Column(name = "cpl_point_cost")
    private Integer cplPointCost;

    /**
     * 兑换的时间
     */
    @Column(name = "cpl_create_time")
    private Date cplCreateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取兑换历史ID
     *
     * @return cpl_id - 兑换历史ID
     */
    public Integer getCplId() {
        return cplId;
    }

    /**
     * 设置兑换历史ID
     *
     * @param cplId 兑换历史ID
     */
    public void setCplId(Integer cplId) {
        this.cplId = cplId;
    }

    /**
     * 获取消费者ID
     *
     * @return cpl_customer_id - 消费者ID
     */
    public Integer getCplCustomerId() {
        return cplCustomerId;
    }

    /**
     * 设置消费者ID
     *
     * @param cplCustomerId 消费者ID
     */
    public void setCplCustomerId(Integer cplCustomerId) {
        this.cplCustomerId = cplCustomerId;
    }

    /**
     * 获取积分商品ID
     *
     * @return cpl_present_id - 积分商品ID
     */
    public Integer getCplPresentId() {
        return cplPresentId;
    }

    /**
     * 设置积分商品ID
     *
     * @param cplPresentId 积分商品ID
     */
    public void setCplPresentId(Integer cplPresentId) {
        this.cplPresentId = cplPresentId;
    }

    /**
     * 获取兑换的数量
     *
     * @return cpl_count - 兑换的数量
     */
    public Integer getCplCount() {
        return cplCount;
    }

    /**
     * 设置兑换的数量
     *
     * @param cplCount 兑换的数量
     */
    public void setCplCount(Integer cplCount) {
        this.cplCount = cplCount;
    }

    /**
     * 获取消耗积分
     *
     * @return cpl_point_cost - 消耗积分
     */
    public Integer getCplPointCost() {
        return cplPointCost;
    }

    /**
     * 设置消耗积分
     *
     * @param cplPointCost 消耗积分
     */
    public void setCplPointCost(Integer cplPointCost) {
        this.cplPointCost = cplPointCost;
    }

    /**
     * 获取兑换的时间
     *
     * @return cpl_create_time - 兑换的时间
     */
    public Date getCplCreateTime() {
        return cplCreateTime;
    }

    /**
     * 设置兑换的时间
     *
     * @param cplCreateTime 兑换的时间
     */
    public void setCplCreateTime(Date cplCreateTime) {
        this.cplCreateTime = cplCreateTime;
    }
}