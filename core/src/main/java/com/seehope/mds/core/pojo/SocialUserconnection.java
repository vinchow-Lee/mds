package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "social_userconnection")
public class SocialUserconnection implements Serializable {
    @Id
    @Column(name = "userId")
    private String userid;

    @Id
    @Column(name = "providerId")
    private String providerid;

    @Id
    @Column(name = "providerUserId")
    private String provideruserid;

    @Column(name = "`rank`")
    private Integer rank;

    @Column(name = "displayName")
    private String displayname;

    @Column(name = "profileUrl")
    private String profileurl;

    @Column(name = "imageUrl")
    private String imageurl;

    @Column(name = "accessToken")
    private String accesstoken;

    @Column(name = "secret")
    private String secret;

    @Column(name = "refreshToken")
    private String refreshtoken;

    @Column(name = "expireTime")
    private Long expiretime;

    private static final long serialVersionUID = 1L;

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return providerId
     */
    public String getProviderid() {
        return providerid;
    }

    /**
     * @param providerid
     */
    public void setProviderid(String providerid) {
        this.providerid = providerid;
    }

    /**
     * @return providerUserId
     */
    public String getProvideruserid() {
        return provideruserid;
    }

    /**
     * @param provideruserid
     */
    public void setProvideruserid(String provideruserid) {
        this.provideruserid = provideruserid;
    }

    /**
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return displayName
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * @param displayname
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    /**
     * @return profileUrl
     */
    public String getProfileurl() {
        return profileurl;
    }

    /**
     * @param profileurl
     */
    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }

    /**
     * @return imageUrl
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * @param imageurl
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**
     * @return accessToken
     */
    public String getAccesstoken() {
        return accesstoken;
    }

    /**
     * @param accesstoken
     */
    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * @return refreshToken
     */
    public String getRefreshtoken() {
        return refreshtoken;
    }

    /**
     * @param refreshtoken
     */
    public void setRefreshtoken(String refreshtoken) {
        this.refreshtoken = refreshtoken;
    }

    /**
     * @return expireTime
     */
    public Long getExpiretime() {
        return expiretime;
    }

    /**
     * @param expiretime
     */
    public void setExpiretime(Long expiretime) {
        this.expiretime = expiretime;
    }
}