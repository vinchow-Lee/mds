package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "address")
public class Address implements Serializable {
    /**
     * 自增主键ID
     */
    @Id
    @Column(name = "addr_id")
    @GeneratedValue(generator = "JDBC")
    private Integer addrId;

    /**
     * 用户id
     */
    @Column(name = "addr_user_id")
    private Integer addrUserId;

    /**
     * 邮编
     */
    @Column(name = "addr_zip")
    private Integer addrZip;

    /**
     * 地区表中省份
     */
    @Column(name = "addr_province")
    private String addrProvince;

    /**
     * 地区表中城市
     */
    @Column(name = "addr_city")
    private String addrCity;

    /**
     * 地区表中的区
     */
    @Column(name = "addr_district")
    private String addrDistrict;

    /**
     * 具体的地址门牌号
     */
    @Column(name = "addr_detail")
    private String addrDetail;

    /**
     * 是否默认
     */
    @Column(name = "addr_is_default")
    private Boolean addrIsDefault;

    /**
     * 最后修改时间
     */
    @Column(name = "addr_modified_time")
    private Date addrModifiedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增主键ID
     *
     * @return addr_id - 自增主键ID
     */
    public Integer getAddrId() {
        return addrId;
    }

    /**
     * 设置自增主键ID
     *
     * @param addrId 自增主键ID
     */
    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    /**
     * 获取用户id
     *
     * @return addr_user_id - 用户id
     */
    public Integer getAddrUserId() {
        return addrUserId;
    }

    /**
     * 设置用户id
     *
     * @param addrUserId 用户id
     */
    public void setAddrUserId(Integer addrUserId) {
        this.addrUserId = addrUserId;
    }

    /**
     * 获取邮编
     *
     * @return addr_zip - 邮编
     */
    public Integer getAddrZip() {
        return addrZip;
    }

    /**
     * 设置邮编
     *
     * @param addrZip 邮编
     */
    public void setAddrZip(Integer addrZip) {
        this.addrZip = addrZip;
    }

    /**
     * 获取地区表中省份
     *
     * @return addr_province - 地区表中省份
     */
    public String getAddrProvince() {
        return addrProvince;
    }

    /**
     * 设置地区表中省份
     *
     * @param addrProvince 地区表中省份
     */
    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    /**
     * 获取地区表中城市
     *
     * @return addr_city - 地区表中城市
     */
    public String getAddrCity() {
        return addrCity;
    }

    /**
     * 设置地区表中城市
     *
     * @param addrCity 地区表中城市
     */
    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    /**
     * 获取地区表中的区
     *
     * @return addr_district - 地区表中的区
     */
    public String getAddrDistrict() {
        return addrDistrict;
    }

    /**
     * 设置地区表中的区
     *
     * @param addrDistrict 地区表中的区
     */
    public void setAddrDistrict(String addrDistrict) {
        this.addrDistrict = addrDistrict;
    }

    /**
     * 获取具体的地址门牌号
     *
     * @return addr_detail - 具体的地址门牌号
     */
    public String getAddrDetail() {
        return addrDetail;
    }

    /**
     * 设置具体的地址门牌号
     *
     * @param addrDetail 具体的地址门牌号
     */
    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    /**
     * 获取是否默认
     *
     * @return addr_is_default - 是否默认
     */
    public Boolean getAddrIsDefault() {
        return addrIsDefault;
    }

    /**
     * 设置是否默认
     *
     * @param addrIsDefault 是否默认
     */
    public void setAddrIsDefault(Boolean addrIsDefault) {
        this.addrIsDefault = addrIsDefault;
    }

    /**
     * 获取最后修改时间
     *
     * @return addr_modified_time - 最后修改时间
     */
    public Date getAddrModifiedTime() {
        return addrModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param addrModifiedTime 最后修改时间
     */
    public void setAddrModifiedTime(Date addrModifiedTime) {
        this.addrModifiedTime = addrModifiedTime;
    }
}