package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    /**
     * 订单详情表ID
     */
    @Id
    @Column(name = "od_id")
    @GeneratedValue(generator = "JDBC")
    private Integer odId;

    /**
     * 订单表ID
     */
    @Column(name = "od_order_id")
    private Integer odOrderId;

    /**
     * 订单商品ID
     */
    @Column(name = "od_product_id")
    private Integer odProductId;

    /**
     * 商品名称
     */
    @Column(name = "od_product_name")
    private String odProductName;

    /**
     * 购买商品数量
     */
    @Column(name = "od_product_cnt")
    private Integer odProductCnt;

    /**
     * 购买商品单价
     */
    @Column(name = "od_product_price")
    private BigDecimal odProductPrice;

    /**
     * 购买商品小计
     */
    @Column(name = "od_product_totalPrice")
    private BigDecimal odProductTotalprice;

    /**
     * 最后修改时间
     */
    @Column(name = "od_modified_time")
    private Date odModifiedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取订单详情表ID
     *
     * @return od_id - 订单详情表ID
     */
    public Integer getOdId() {
        return odId;
    }

    /**
     * 设置订单详情表ID
     *
     * @param odId 订单详情表ID
     */
    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    /**
     * 获取订单表ID
     *
     * @return od_order_id - 订单表ID
     */
    public Integer getOdOrderId() {
        return odOrderId;
    }

    /**
     * 设置订单表ID
     *
     * @param odOrderId 订单表ID
     */
    public void setOdOrderId(Integer odOrderId) {
        this.odOrderId = odOrderId;
    }

    /**
     * 获取订单商品ID
     *
     * @return od_product_id - 订单商品ID
     */
    public Integer getOdProductId() {
        return odProductId;
    }

    /**
     * 设置订单商品ID
     *
     * @param odProductId 订单商品ID
     */
    public void setOdProductId(Integer odProductId) {
        this.odProductId = odProductId;
    }

    /**
     * 获取商品名称
     *
     * @return od_product_name - 商品名称
     */
    public String getOdProductName() {
        return odProductName;
    }

    /**
     * 设置商品名称
     *
     * @param odProductName 商品名称
     */
    public void setOdProductName(String odProductName) {
        this.odProductName = odProductName;
    }

    /**
     * 获取购买商品数量
     *
     * @return od_product_cnt - 购买商品数量
     */
    public Integer getOdProductCnt() {
        return odProductCnt;
    }

    /**
     * 设置购买商品数量
     *
     * @param odProductCnt 购买商品数量
     */
    public void setOdProductCnt(Integer odProductCnt) {
        this.odProductCnt = odProductCnt;
    }

    /**
     * 获取购买商品单价
     *
     * @return od_product_price - 购买商品单价
     */
    public BigDecimal getOdProductPrice() {
        return odProductPrice;
    }

    /**
     * 设置购买商品单价
     *
     * @param odProductPrice 购买商品单价
     */
    public void setOdProductPrice(BigDecimal odProductPrice) {
        this.odProductPrice = odProductPrice;
    }

    /**
     * 获取购买商品小计
     *
     * @return od_product_totalPrice - 购买商品小计
     */
    public BigDecimal getOdProductTotalprice() {
        return odProductTotalprice;
    }

    /**
     * 设置购买商品小计
     *
     * @param odProductTotalprice 购买商品小计
     */
    public void setOdProductTotalprice(BigDecimal odProductTotalprice) {
        this.odProductTotalprice = odProductTotalprice;
    }

    /**
     * 获取最后修改时间
     *
     * @return od_modified_time - 最后修改时间
     */
    public Date getOdModifiedTime() {
        return odModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param odModifiedTime 最后修改时间
     */
    public void setOdModifiedTime(Date odModifiedTime) {
        this.odModifiedTime = odModifiedTime;
    }
}