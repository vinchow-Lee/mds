package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product_distribution")
public class ProductDistribution implements Serializable {
    /**
     * 物流记录ID
     */
    @Id
    @Column(name = "distribution_id")
    @GeneratedValue(generator = "JDBC")
    private Integer distributionId;

    /**
     * 所扫描二维码ID
     */
    @Column(name = "distribution_qrcode_id")
    private Integer distributionQrcodeId;

    /**
     * 扫描代理商ID
     */
    @Column(name = "distribution_agent_id")
    private Integer distributionAgentId;

    /**
     * 扫描操作，入库为 true，出库为 false
     */
    @Column(name = "distribution_action")
    private Boolean distributionAction;

    /**
     * 扫描时间
     */
    @Column(name = "distribution_scan_time")
    private Date distributionScanTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取物流记录ID
     *
     * @return distribution_id - 物流记录ID
     */
    public Integer getDistributionId() {
        return distributionId;
    }

    /**
     * 设置物流记录ID
     *
     * @param distributionId 物流记录ID
     */
    public void setDistributionId(Integer distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * 获取所扫描二维码ID
     *
     * @return distribution_qrcode_id - 所扫描二维码ID
     */
    public Integer getDistributionQrcodeId() {
        return distributionQrcodeId;
    }

    /**
     * 设置所扫描二维码ID
     *
     * @param distributionQrcodeId 所扫描二维码ID
     */
    public void setDistributionQrcodeId(Integer distributionQrcodeId) {
        this.distributionQrcodeId = distributionQrcodeId;
    }

    /**
     * 获取扫描代理商ID
     *
     * @return distribution_agent_id - 扫描代理商ID
     */
    public Integer getDistributionAgentId() {
        return distributionAgentId;
    }

    /**
     * 设置扫描代理商ID
     *
     * @param distributionAgentId 扫描代理商ID
     */
    public void setDistributionAgentId(Integer distributionAgentId) {
        this.distributionAgentId = distributionAgentId;
    }

    /**
     * 获取扫描操作，入库为 true，出库为 false
     *
     * @return distribution_action - 扫描操作，入库为 true，出库为 false
     */
    public Boolean getDistributionAction() {
        return distributionAction;
    }

    /**
     * 设置扫描操作，入库为 true，出库为 false
     *
     * @param distributionAction 扫描操作，入库为 true，出库为 false
     */
    public void setDistributionAction(Boolean distributionAction) {
        this.distributionAction = distributionAction;
    }

    /**
     * 获取扫描时间
     *
     * @return distribution_scan_time - 扫描时间
     */
    public Date getDistributionScanTime() {
        return distributionScanTime;
    }

    /**
     * 设置扫描时间
     *
     * @param distributionScanTime 扫描时间
     */
    public void setDistributionScanTime(Date distributionScanTime) {
        this.distributionScanTime = distributionScanTime;
    }
}