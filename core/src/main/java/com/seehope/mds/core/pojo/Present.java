package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "present")
public class Present implements Serializable {
    /**
     * 积分商品ID
     */
    @Id
    @Column(name = "present_id")
    @GeneratedValue(generator = "JDBC")
    private Integer presentId;

    /**
     * 积分商品的标题
     */
    @Column(name = "present_title")
    private String presentTitle;

    /**
     * 需要兑换的积分值
     */
    @Column(name = "present_point")
    private Integer presentPoint;

    /**
     * 积分商品的图片
     */
    @Column(name = "present_imgUrl")
    private String presentImgurl;

    private static final long serialVersionUID = 1L;

    /**
     * 获取积分商品ID
     *
     * @return present_id - 积分商品ID
     */
    public Integer getPresentId() {
        return presentId;
    }

    /**
     * 设置积分商品ID
     *
     * @param presentId 积分商品ID
     */
    public void setPresentId(Integer presentId) {
        this.presentId = presentId;
    }

    /**
     * 获取积分商品的标题
     *
     * @return present_title - 积分商品的标题
     */
    public String getPresentTitle() {
        return presentTitle;
    }

    /**
     * 设置积分商品的标题
     *
     * @param presentTitle 积分商品的标题
     */
    public void setPresentTitle(String presentTitle) {
        this.presentTitle = presentTitle;
    }

    /**
     * 获取需要兑换的积分值
     *
     * @return present_point - 需要兑换的积分值
     */
    public Integer getPresentPoint() {
        return presentPoint;
    }

    /**
     * 设置需要兑换的积分值
     *
     * @param presentPoint 需要兑换的积分值
     */
    public void setPresentPoint(Integer presentPoint) {
        this.presentPoint = presentPoint;
    }

    /**
     * 获取积分商品的图片
     *
     * @return present_imgUrl - 积分商品的图片
     */
    public String getPresentImgurl() {
        return presentImgurl;
    }

    /**
     * 设置积分商品的图片
     *
     * @param presentImgurl 积分商品的图片
     */
    public void setPresentImgurl(String presentImgurl) {
        this.presentImgurl = presentImgurl;
    }
}