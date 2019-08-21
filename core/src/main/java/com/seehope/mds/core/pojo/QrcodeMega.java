package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrcode_mega")
public class QrcodeMega implements Serializable {
    /**
     * 大码二维码ID
     */
    @Id
    @Column(name = "qrcode_mega_id")
    @GeneratedValue(generator = "JDBC")
    private Integer qrcodeMegaId;

    /**
     * 大码地址
     */
    @Column(name = "qrcode_mega_url")
    private String qrcodeMegaUrl;

    private static final long serialVersionUID = 1L;

    /**
     * 获取大码二维码ID
     *
     * @return qrcode_mega_id - 大码二维码ID
     */
    public Integer getQrcodeMegaId() {
        return qrcodeMegaId;
    }

    /**
     * 设置大码二维码ID
     *
     * @param qrcodeMegaId 大码二维码ID
     */
    public void setQrcodeMegaId(Integer qrcodeMegaId) {
        this.qrcodeMegaId = qrcodeMegaId;
    }

    /**
     * 获取大码地址
     *
     * @return qrcode_mega_url - 大码地址
     */
    public String getQrcodeMegaUrl() {
        return qrcodeMegaUrl;
    }

    /**
     * 设置大码地址
     *
     * @param qrcodeMegaUrl 大码地址
     */
    public void setQrcodeMegaUrl(String qrcodeMegaUrl) {
        this.qrcodeMegaUrl = qrcodeMegaUrl;
    }
}