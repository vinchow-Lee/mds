package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`order`")
public class Order implements Serializable {
    /**
     * 订单ID
     */
    @Id
    @Column(name = "order_id")
    @GeneratedValue(generator = "JDBC")
    private Integer orderId;

    /**
     * 订单编号 yyyymmddnnnnnnnn
     */
    @Column(name = "order_sn")
    private Long orderSn;

    /**
     * 下单人ID
     */
    @Column(name = "order_user_id")
    private Integer orderUserId;

    /**
     * 收货人姓名
     */
    @Column(name = "order_shipping_user")
    private String orderShippingUser;

    /**
     * 省
     */
    @Column(name = "order_province")
    private String orderProvince;

    /**
     * 市
     */
    @Column(name = "order_city")
    private String orderCity;

    /**
     * 区
     */
    @Column(name = "order_district")
    private String orderDistrict;

    /**
     * 地址
     */
    @Column(name = "order_address")
    private String orderAddress;

    /**
     * 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    @Column(name = "order_payment_method")
    private Byte orderPaymentMethod;

    /**
     * 订单金额
     */
    @Column(name = "order_money")
    private BigDecimal orderMoney;

    /**
     * 优惠金额
     */
    @Column(name = "order_district_money")
    private BigDecimal orderDistrictMoney;

    /**
     * 运费金额
     */
    @Column(name = "order_shipping_money")
    private BigDecimal orderShippingMoney;

    /**
     * 支付金额
     */
    @Column(name = "order_payment_money")
    private BigDecimal orderPaymentMoney;

    /**
     * 快递公司名称
     */
    @Column(name = "order_shipping_comp_name")
    private String orderShippingCompName;

    /**
     * 快递单号
     */
    @Column(name = "order_shipping_sn")
    private String orderShippingSn;

    /**
     * 下单时间
     */
    @Column(name = "order_create_time")
    private Date orderCreateTime;

    /**
     * 发货时间
     */
    @Column(name = "order_shipping_time")
    private Date orderShippingTime;

    /**
     * 收货时间
     */
    @Column(name = "order_receive_time")
    private Date orderReceiveTime;

    /**
     * 订单状态：1.未入库 2.已入库 3.未出库 4.已出库 5.已收货
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 订单积分
     */
    @Column(name = "order_point")
    private Integer orderPoint;

    /**
     * 最后修改时间
     */
    @Column(name = "order_modified_time")
    private Date orderModifiedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号 yyyymmddnnnnnnnn
     *
     * @return order_sn - 订单编号 yyyymmddnnnnnnnn
     */
    public Long getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号 yyyymmddnnnnnnnn
     *
     * @param orderSn 订单编号 yyyymmddnnnnnnnn
     */
    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 获取下单人ID
     *
     * @return order_user_id - 下单人ID
     */
    public Integer getOrderUserId() {
        return orderUserId;
    }

    /**
     * 设置下单人ID
     *
     * @param orderUserId 下单人ID
     */
    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    /**
     * 获取收货人姓名
     *
     * @return order_shipping_user - 收货人姓名
     */
    public String getOrderShippingUser() {
        return orderShippingUser;
    }

    /**
     * 设置收货人姓名
     *
     * @param orderShippingUser 收货人姓名
     */
    public void setOrderShippingUser(String orderShippingUser) {
        this.orderShippingUser = orderShippingUser;
    }

    /**
     * 获取省
     *
     * @return order_province - 省
     */
    public String getOrderProvince() {
        return orderProvince;
    }

    /**
     * 设置省
     *
     * @param orderProvince 省
     */
    public void setOrderProvince(String orderProvince) {
        this.orderProvince = orderProvince;
    }

    /**
     * 获取市
     *
     * @return order_city - 市
     */
    public String getOrderCity() {
        return orderCity;
    }

    /**
     * 设置市
     *
     * @param orderCity 市
     */
    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity;
    }

    /**
     * 获取区
     *
     * @return order_district - 区
     */
    public String getOrderDistrict() {
        return orderDistrict;
    }

    /**
     * 设置区
     *
     * @param orderDistrict 区
     */
    public void setOrderDistrict(String orderDistrict) {
        this.orderDistrict = orderDistrict;
    }

    /**
     * 获取地址
     *
     * @return order_address - 地址
     */
    public String getOrderAddress() {
        return orderAddress;
    }

    /**
     * 设置地址
     *
     * @param orderAddress 地址
     */
    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    /**
     * 获取支付方式：1现金，2余额，3网银，4支付宝，5微信
     *
     * @return order_payment_method - 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    public Byte getOrderPaymentMethod() {
        return orderPaymentMethod;
    }

    /**
     * 设置支付方式：1现金，2余额，3网银，4支付宝，5微信
     *
     * @param orderPaymentMethod 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    public void setOrderPaymentMethod(Byte orderPaymentMethod) {
        this.orderPaymentMethod = orderPaymentMethod;
    }

    /**
     * 获取订单金额
     *
     * @return order_money - 订单金额
     */
    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置订单金额
     *
     * @param orderMoney 订单金额
     */
    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * 获取优惠金额
     *
     * @return order_district_money - 优惠金额
     */
    public BigDecimal getOrderDistrictMoney() {
        return orderDistrictMoney;
    }

    /**
     * 设置优惠金额
     *
     * @param orderDistrictMoney 优惠金额
     */
    public void setOrderDistrictMoney(BigDecimal orderDistrictMoney) {
        this.orderDistrictMoney = orderDistrictMoney;
    }

    /**
     * 获取运费金额
     *
     * @return order_shipping_money - 运费金额
     */
    public BigDecimal getOrderShippingMoney() {
        return orderShippingMoney;
    }

    /**
     * 设置运费金额
     *
     * @param orderShippingMoney 运费金额
     */
    public void setOrderShippingMoney(BigDecimal orderShippingMoney) {
        this.orderShippingMoney = orderShippingMoney;
    }

    /**
     * 获取支付金额
     *
     * @return order_payment_money - 支付金额
     */
    public BigDecimal getOrderPaymentMoney() {
        return orderPaymentMoney;
    }

    /**
     * 设置支付金额
     *
     * @param orderPaymentMoney 支付金额
     */
    public void setOrderPaymentMoney(BigDecimal orderPaymentMoney) {
        this.orderPaymentMoney = orderPaymentMoney;
    }

    /**
     * 获取快递公司名称
     *
     * @return order_shipping_comp_name - 快递公司名称
     */
    public String getOrderShippingCompName() {
        return orderShippingCompName;
    }

    /**
     * 设置快递公司名称
     *
     * @param orderShippingCompName 快递公司名称
     */
    public void setOrderShippingCompName(String orderShippingCompName) {
        this.orderShippingCompName = orderShippingCompName;
    }

    /**
     * 获取快递单号
     *
     * @return order_shipping_sn - 快递单号
     */
    public String getOrderShippingSn() {
        return orderShippingSn;
    }

    /**
     * 设置快递单号
     *
     * @param orderShippingSn 快递单号
     */
    public void setOrderShippingSn(String orderShippingSn) {
        this.orderShippingSn = orderShippingSn;
    }

    /**
     * 获取下单时间
     *
     * @return order_create_time - 下单时间
     */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /**
     * 设置下单时间
     *
     * @param orderCreateTime 下单时间
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * 获取发货时间
     *
     * @return order_shipping_time - 发货时间
     */
    public Date getOrderShippingTime() {
        return orderShippingTime;
    }

    /**
     * 设置发货时间
     *
     * @param orderShippingTime 发货时间
     */
    public void setOrderShippingTime(Date orderShippingTime) {
        this.orderShippingTime = orderShippingTime;
    }

    /**
     * 获取收货时间
     *
     * @return order_receive_time - 收货时间
     */
    public Date getOrderReceiveTime() {
        return orderReceiveTime;
    }

    /**
     * 设置收货时间
     *
     * @param orderReceiveTime 收货时间
     */
    public void setOrderReceiveTime(Date orderReceiveTime) {
        this.orderReceiveTime = orderReceiveTime;
    }

    /**
     * 获取订单状态：1.未入库 2.已入库 3.未出库 4.已出库 5.已收货
     *
     * @return order_status - 订单状态：1.未入库 2.已入库 3.未出库 4.已出库 5.已收货
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态：1.未入库 2.已入库 3.未出库 4.已出库 5.已收货
     *
     * @param orderStatus 订单状态：1.未入库 2.已入库 3.未出库 4.已出库 5.已收货
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单积分
     *
     * @return order_point - 订单积分
     */
    public Integer getOrderPoint() {
        return orderPoint;
    }

    /**
     * 设置订单积分
     *
     * @param orderPoint 订单积分
     */
    public void setOrderPoint(Integer orderPoint) {
        this.orderPoint = orderPoint;
    }

    /**
     * 获取最后修改时间
     *
     * @return order_modified_time - 最后修改时间
     */
    public Date getOrderModifiedTime() {
        return orderModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param orderModifiedTime 最后修改时间
     */
    public void setOrderModifiedTime(Date orderModifiedTime) {
        this.orderModifiedTime = orderModifiedTime;
    }
}