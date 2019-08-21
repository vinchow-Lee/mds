package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wehcat")
public class Wehcat implements Serializable {
    /**
     * wechat的id
     */
    @Id
    @Column(name = "wechat_id")
    @GeneratedValue(generator = "JDBC")
    private Integer wechatId;

    /**
     * wechat的用户名
     */
    @Column(name = "wechat_username")
    private String wechatUsername;

    /**
     * wechat的密码
     */
    @Column(name = "wechat_password")
    private String wechatPassword;

    /**
     * 手机号码
     */
    @Column(name = "wechat_phone")
    private String wechatPhone;

    /**
     * 头像(可无)
     */
    @Column(name = "wechat_imgUrl")
    private String wechatImgurl;

    private static final long serialVersionUID = 1L;

    /**
     * 获取wechat的id
     *
     * @return wechat_id - wechat的id
     */
    public Integer getWechatId() {
        return wechatId;
    }

    /**
     * 设置wechat的id
     *
     * @param wechatId wechat的id
     */
    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    /**
     * 获取wechat的用户名
     *
     * @return wechat_username - wechat的用户名
     */
    public String getWechatUsername() {
        return wechatUsername;
    }

    /**
     * 设置wechat的用户名
     *
     * @param wechatUsername wechat的用户名
     */
    public void setWechatUsername(String wechatUsername) {
        this.wechatUsername = wechatUsername;
    }

    /**
     * 获取wechat的密码
     *
     * @return wechat_password - wechat的密码
     */
    public String getWechatPassword() {
        return wechatPassword;
    }

    /**
     * 设置wechat的密码
     *
     * @param wechatPassword wechat的密码
     */
    public void setWechatPassword(String wechatPassword) {
        this.wechatPassword = wechatPassword;
    }

    /**
     * 获取手机号码
     *
     * @return wechat_phone - 手机号码
     */
    public String getWechatPhone() {
        return wechatPhone;
    }

    /**
     * 设置手机号码
     *
     * @param wechatPhone 手机号码
     */
    public void setWechatPhone(String wechatPhone) {
        this.wechatPhone = wechatPhone;
    }

    /**
     * 获取头像(可无)
     *
     * @return wechat_imgUrl - 头像(可无)
     */
    public String getWechatImgurl() {
        return wechatImgurl;
    }

    /**
     * 设置头像(可无)
     *
     * @param wechatImgurl 头像(可无)
     */
    public void setWechatImgurl(String wechatImgurl) {
        this.wechatImgurl = wechatImgurl;
    }
}