package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product")
public class Product implements Serializable {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "product_id")
    @GeneratedValue(generator = "JDBC")
    private Integer productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 一级分类ID
     */
    @Column(name = "one_category_id")
    private Integer oneCategoryId;

    /**
     * 二级分类ID
     */
    @Column(name = "two_category_id")
    private Integer twoCategoryId;

    /**
     * 商品销售价格
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 上下架状态：false下架 true上架
     */
    @Column(name = "product_publish")
    private Boolean productPublish;

    /**
     * 生产日期
     */
    @Column(name = "product_produce_date")
    private Date productProduceDate;

    /**
     * 商品图片
     */
    @Column(name = "product_pic_url")
    private String productPicUrl;

    /**
     * 商品描述
     */
    @Column(name = "product_descript")
    private String productDescript;

    /**
     * 商品录入时间
     */
    @Column(name = "product_indate")
    private Date productIndate;

    /**
     * 最后修改时间
     */
    @Column(name = "product_modified_time")
    private Date productModifiedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取一级分类ID
     *
     * @return one_category_id - 一级分类ID
     */
    public Integer getOneCategoryId() {
        return oneCategoryId;
    }

    /**
     * 设置一级分类ID
     *
     * @param oneCategoryId 一级分类ID
     */
    public void setOneCategoryId(Integer oneCategoryId) {
        this.oneCategoryId = oneCategoryId;
    }

    /**
     * 获取二级分类ID
     *
     * @return two_category_id - 二级分类ID
     */
    public Integer getTwoCategoryId() {
        return twoCategoryId;
    }

    /**
     * 设置二级分类ID
     *
     * @param twoCategoryId 二级分类ID
     */
    public void setTwoCategoryId(Integer twoCategoryId) {
        this.twoCategoryId = twoCategoryId;
    }

    /**
     * 获取商品销售价格
     *
     * @return product_price - 商品销售价格
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 设置商品销售价格
     *
     * @param productPrice 商品销售价格
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取上下架状态：false下架 true上架
     *
     * @return product_publish - 上下架状态：false下架 true上架
     */
    public Boolean getProductPublish() {
        return productPublish;
    }

    /**
     * 设置上下架状态：false下架 true上架
     *
     * @param productPublish 上下架状态：false下架 true上架
     */
    public void setProductPublish(Boolean productPublish) {
        this.productPublish = productPublish;
    }

    /**
     * 获取生产日期
     *
     * @return product_produce_date - 生产日期
     */
    public Date getProductProduceDate() {
        return productProduceDate;
    }

    /**
     * 设置生产日期
     *
     * @param productProduceDate 生产日期
     */
    public void setProductProduceDate(Date productProduceDate) {
        this.productProduceDate = productProduceDate;
    }

    /**
     * 获取商品图片
     *
     * @return product_pic_url - 商品图片
     */
    public String getProductPicUrl() {
        return productPicUrl;
    }

    /**
     * 设置商品图片
     *
     * @param productPicUrl 商品图片
     */
    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    /**
     * 获取商品描述
     *
     * @return product_descript - 商品描述
     */
    public String getProductDescript() {
        return productDescript;
    }

    /**
     * 设置商品描述
     *
     * @param productDescript 商品描述
     */
    public void setProductDescript(String productDescript) {
        this.productDescript = productDescript;
    }

    /**
     * 获取商品录入时间
     *
     * @return product_indate - 商品录入时间
     */
    public Date getProductIndate() {
        return productIndate;
    }

    /**
     * 设置商品录入时间
     *
     * @param productIndate 商品录入时间
     */
    public void setProductIndate(Date productIndate) {
        this.productIndate = productIndate;
    }

    /**
     * 获取最后修改时间
     *
     * @return product_modified_time - 最后修改时间
     */
    public Date getProductModifiedTime() {
        return productModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param productModifiedTime 最后修改时间
     */
    public void setProductModifiedTime(Date productModifiedTime) {
        this.productModifiedTime = productModifiedTime;
    }
}