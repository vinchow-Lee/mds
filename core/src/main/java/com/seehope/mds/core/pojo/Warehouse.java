package com.seehope.mds.core.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "warehouse")
public class Warehouse implements Serializable {
    /**
     * 代理商ID
     */
    @Id
    @Column(name = "w_agent_id")
    private Integer wAgentId;

    /**
     * 商品ID
     */
    @Id
    @Column(name = "w_product_id")
    private Integer wProductId;

    /**
     * 当前商品数量
     */
    @Column(name = "w_current_cnt")
    private Integer wCurrentCnt;

    /**
     * 最后修改时间
     */
    @Column(name = "w_modified_time")
    private Date wModifiedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取代理商ID
     *
     * @return w_agent_id - 代理商ID
     */
    public Integer getwAgentId() {
        return wAgentId;
    }

    /**
     * 设置代理商ID
     *
     * @param wAgentId 代理商ID
     */
    public void setwAgentId(Integer wAgentId) {
        this.wAgentId = wAgentId;
    }

    /**
     * 获取商品ID
     *
     * @return w_product_id - 商品ID
     */
    public Integer getwProductId() {
        return wProductId;
    }

    /**
     * 设置商品ID
     *
     * @param wProductId 商品ID
     */
    public void setwProductId(Integer wProductId) {
        this.wProductId = wProductId;
    }

    /**
     * 获取当前商品数量
     *
     * @return w_current_cnt - 当前商品数量
     */
    public Integer getwCurrentCnt() {
        return wCurrentCnt;
    }

    /**
     * 设置当前商品数量
     *
     * @param wCurrentCnt 当前商品数量
     */
    public void setwCurrentCnt(Integer wCurrentCnt) {
        this.wCurrentCnt = wCurrentCnt;
    }

    /**
     * 获取最后修改时间
     *
     * @return w_modified_time - 最后修改时间
     */
    public Date getwModifiedTime() {
        return wModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param wModifiedTime 最后修改时间
     */
    public void setwModifiedTime(Date wModifiedTime) {
        this.wModifiedTime = wModifiedTime;
    }
}