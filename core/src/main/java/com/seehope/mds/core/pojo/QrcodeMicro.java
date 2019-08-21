package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrcode_micro")
public class QrcodeMicro implements Serializable {
    /**
     * 二维码ID
     */
    @Id
    @Column(name = "qrcode_micro_id")
    @GeneratedValue(generator = "JDBC")
    private Integer qrcodeMicroId;

    /**
     * 产品ID
     */
    @Column(name = "qrcode_micro_product_id")
    private Integer qrcodeMicroProductId;

    /**
     * 二维码地址
     */
    @Column(name = "qrcode_micro_url")
    private String qrcodeMicroUrl;

    /**
     * 是否已防伪查询
     */
    @Column(name = "qrcode_micro_accessed")
    private Boolean qrcodeMicroAccessed;

    private static final long serialVersionUID = 1L;

    /**
     * 获取二维码ID
     *
     * @return qrcode_micro_id - 二维码ID
     */
    public Integer getQrcodeMicroId() {
        return qrcodeMicroId;
    }

    /**
     * 设置二维码ID
     *
     * @param qrcodeMicroId 二维码ID
     */
    public void setQrcodeMicroId(Integer qrcodeMicroId) {
        this.qrcodeMicroId = qrcodeMicroId;
    }

    /**
     * 获取产品ID
     *
     * @return qrcode_micro_product_id - 产品ID
     */
    public Integer getQrcodeMicroProductId() {
        return qrcodeMicroProductId;
    }

    /**
     * 设置产品ID
     *
     * @param qrcodeMicroProductId 产品ID
     */
    public void setQrcodeMicroProductId(Integer qrcodeMicroProductId) {
        this.qrcodeMicroProductId = qrcodeMicroProductId;
    }

    /**
     * 获取二维码地址
     *
     * @return qrcode_micro_url - 二维码地址
     */
    public String getQrcodeMicroUrl() {
        return qrcodeMicroUrl;
    }

    /**
     * 设置二维码地址
     *
     * @param qrcodeMicroUrl 二维码地址
     */
    public void setQrcodeMicroUrl(String qrcodeMicroUrl) {
        this.qrcodeMicroUrl = qrcodeMicroUrl;
    }

    /**
     * 获取是否已防伪查询
     *
     * @return qrcode_micro_accessed - 是否已防伪查询
     */
    public Boolean getQrcodeMicroAccessed() {
        return qrcodeMicroAccessed;
    }

    /**
     * 设置是否已防伪查询
     *
     * @param qrcodeMicroAccessed 是否已防伪查询
     */
    public void setQrcodeMicroAccessed(Boolean qrcodeMicroAccessed) {
        this.qrcodeMicroAccessed = qrcodeMicroAccessed;
    }
}