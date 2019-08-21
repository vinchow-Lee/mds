package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "customer_login_log")
public class CustomerLoginLog implements Serializable {
    /**
     * 登陆日志ID
     */
    @Id
    @Column(name = "cll_id")
    @GeneratedValue(generator = "JDBC")
    private Integer cllId;

    /**
     * 登陆用户ID
     */
    @Column(name = "cll_customer_id")
    private Integer cllCustomerId;

    /**
     * 用户登陆时间
     */
    @Column(name = "cll_time")
    private Date cllTime;

    /**
     * 登陆IP
     */
    @Column(name = "cll_ip")
    private String cllIp;

    /**
     * 登陆类型：0未成功，1成功
     */
    @Column(name = "cll_type")
    private Byte cllType;

    private static final long serialVersionUID = 1L;

    /**
     * 获取登陆日志ID
     *
     * @return cll_id - 登陆日志ID
     */
    public Integer getCllId() {
        return cllId;
    }

    /**
     * 设置登陆日志ID
     *
     * @param cllId 登陆日志ID
     */
    public void setCllId(Integer cllId) {
        this.cllId = cllId;
    }

    /**
     * 获取登陆用户ID
     *
     * @return cll_customer_id - 登陆用户ID
     */
    public Integer getCllCustomerId() {
        return cllCustomerId;
    }

    /**
     * 设置登陆用户ID
     *
     * @param cllCustomerId 登陆用户ID
     */
    public void setCllCustomerId(Integer cllCustomerId) {
        this.cllCustomerId = cllCustomerId;
    }

    /**
     * 获取用户登陆时间
     *
     * @return cll_time - 用户登陆时间
     */
    public Date getCllTime() {
        return cllTime;
    }

    /**
     * 设置用户登陆时间
     *
     * @param cllTime 用户登陆时间
     */
    public void setCllTime(Date cllTime) {
        this.cllTime = cllTime;
    }

    /**
     * 获取登陆IP
     *
     * @return cll_ip - 登陆IP
     */
    public String getCllIp() {
        return cllIp;
    }

    /**
     * 设置登陆IP
     *
     * @param cllIp 登陆IP
     */
    public void setCllIp(String cllIp) {
        this.cllIp = cllIp;
    }

    /**
     * 获取登陆类型：0未成功，1成功
     *
     * @return cll_type - 登陆类型：0未成功，1成功
     */
    public Byte getCllType() {
        return cllType;
    }

    /**
     * 设置登陆类型：0未成功，1成功
     *
     * @param cllType 登陆类型：0未成功，1成功
     */
    public void setCllType(Byte cllType) {
        this.cllType = cllType;
    }
}