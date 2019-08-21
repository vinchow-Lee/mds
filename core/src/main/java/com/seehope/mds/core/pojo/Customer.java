package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "customer")
public class Customer implements Serializable {
    /**
     * 消费者的ID
     */
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(generator = "JDBC")
    private Integer customerId;

    /**
     * 消费者的昵称
     */
    @Column(name = "customer_username")
    private String customerUsername;

    /**
     * 手机号码
     */
    @Column(name = "customer_phone")
    private String customerPhone;

    /**
     * 收货地址
     */
    @Column(name = "customer_address")
    private String customerAddress;

    /**
     * 头像(可无)
     */
    @Column(name = "customer_imgUrl")
    private String customerImgurl;

    /**
     * 积分值
     */
    @Column(name = "customer_piont")
    private Integer customerPiont;

    private static final long serialVersionUID = 1L;

    /**
     * 获取消费者的ID
     *
     * @return customer_id - 消费者的ID
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置消费者的ID
     *
     * @param customerId 消费者的ID
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取消费者的昵称
     *
     * @return customer_username - 消费者的昵称
     */
    public String getCustomerUsername() {
        return customerUsername;
    }

    /**
     * 设置消费者的昵称
     *
     * @param customerUsername 消费者的昵称
     */
    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    /**
     * 获取手机号码
     *
     * @return customer_phone - 手机号码
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * 设置手机号码
     *
     * @param customerPhone 手机号码
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * 获取收货地址
     *
     * @return customer_address - 收货地址
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * 设置收货地址
     *
     * @param customerAddress 收货地址
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * 获取头像(可无)
     *
     * @return customer_imgUrl - 头像(可无)
     */
    public String getCustomerImgurl() {
        return customerImgurl;
    }

    /**
     * 设置头像(可无)
     *
     * @param customerImgurl 头像(可无)
     */
    public void setCustomerImgurl(String customerImgurl) {
        this.customerImgurl = customerImgurl;
    }

    /**
     * 获取积分值
     *
     * @return customer_piont - 积分值
     */
    public Integer getCustomerPiont() {
        return customerPiont;
    }

    /**
     * 设置积分值
     *
     * @param customerPiont 积分值
     */
    public void setCustomerPiont(Integer customerPiont) {
        this.customerPiont = customerPiont;
    }
}