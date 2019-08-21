package com.seehope.mds.core.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "report")
public class Report implements Serializable {
    /**
     * 举报信息的ID
     */
    @Id
    @Column(name = "report_id")
    @GeneratedValue(generator = "JDBC")
    private Integer reportId;

    /**
     * 举报人ID
     */
    @Column(name = "report_custom_id")
    private Integer reportCustomId;

    /**
     * 经销商ID
     */
    @Column(name = "report_agent_id")
    private Integer reportAgentId;

    /**
     * 防伪码ID
     */
    @Column(name = "report_qrcode_id")
    private Integer reportQrcodeId;

    /**
     * 举报信息
     */
    @Column(name = "report_detail")
    private String reportDetail;

    private static final long serialVersionUID = 1L;

    /**
     * 获取举报信息的ID
     *
     * @return report_id - 举报信息的ID
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * 设置举报信息的ID
     *
     * @param reportId 举报信息的ID
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取举报人ID
     *
     * @return report_custom_id - 举报人ID
     */
    public Integer getReportCustomId() {
        return reportCustomId;
    }

    /**
     * 设置举报人ID
     *
     * @param reportCustomId 举报人ID
     */
    public void setReportCustomId(Integer reportCustomId) {
        this.reportCustomId = reportCustomId;
    }

    /**
     * 获取经销商ID
     *
     * @return report_agent_id - 经销商ID
     */
    public Integer getReportAgentId() {
        return reportAgentId;
    }

    /**
     * 设置经销商ID
     *
     * @param reportAgentId 经销商ID
     */
    public void setReportAgentId(Integer reportAgentId) {
        this.reportAgentId = reportAgentId;
    }

    /**
     * 获取防伪码ID
     *
     * @return report_qrcode_id - 防伪码ID
     */
    public Integer getReportQrcodeId() {
        return reportQrcodeId;
    }

    /**
     * 设置防伪码ID
     *
     * @param reportQrcodeId 防伪码ID
     */
    public void setReportQrcodeId(Integer reportQrcodeId) {
        this.reportQrcodeId = reportQrcodeId;
    }

    /**
     * 获取举报信息
     *
     * @return report_detail - 举报信息
     */
    public String getReportDetail() {
        return reportDetail;
    }

    /**
     * 设置举报信息
     *
     * @param reportDetail 举报信息
     */
    public void setReportDetail(String reportDetail) {
        this.reportDetail = reportDetail;
    }
}