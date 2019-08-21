package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product_category")
public class ProductCategory implements Serializable {
    /**
     * 分类ID
     */
    @Id
    @Column(name = "category_id")
    @GeneratedValue(generator = "JDBC")
    private Integer categoryId;

    /**
     * 分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 父分类ID
     */
    @Column(name = "category_parent_id")
    private Integer categoryParentId;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取分类ID
     *
     * @return category_id - 分类ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类ID
     *
     * @param categoryId 分类ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取分类名称
     *
     * @return category_name - 分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名称
     *
     * @param categoryName 分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取父分类ID
     *
     * @return category_parent_id - 父分类ID
     */
    public Integer getCategoryParentId() {
        return categoryParentId;
    }

    /**
     * 设置父分类ID
     *
     * @param categoryParentId 父分类ID
     */
    public void setCategoryParentId(Integer categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    /**
     * 获取最后修改时间
     *
     * @return modified_time - 最后修改时间
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifiedTime 最后修改时间
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}