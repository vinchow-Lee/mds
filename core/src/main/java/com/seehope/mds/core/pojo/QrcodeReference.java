package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "qrcode_reference")
public class QrcodeReference implements Serializable {
    /**
     * 大码ID
     */
    @Id
    @Column(name = "qrcode_mega_id")
    private Integer qrcodeMegaId;

    /**
     * 小码ID
     */
    @Id
    @Column(name = "qrcode_micro_id")
    private Integer qrcodeMicroId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取大码ID
     *
     * @return qrcode_mega_id - 大码ID
     */
    public Integer getQrcodeMegaId() {
        return qrcodeMegaId;
    }

    /**
     * 设置大码ID
     *
     * @param qrcodeMegaId 大码ID
     */
    public void setQrcodeMegaId(Integer qrcodeMegaId) {
        this.qrcodeMegaId = qrcodeMegaId;
    }

    /**
     * 获取小码ID
     *
     * @return qrcode_micro_id - 小码ID
     */
    public Integer getQrcodeMicroId() {
        return qrcodeMicroId;
    }

    /**
     * 设置小码ID
     *
     * @param qrcodeMicroId 小码ID
     */
    public void setQrcodeMicroId(Integer qrcodeMicroId) {
        this.qrcodeMicroId = qrcodeMicroId;
    }
}