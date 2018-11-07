package com.zzsj.entity;

import java.math.BigInteger;

/**
 * 版块实体类
 */
public class Block {
    private Integer b_id;//版块id
    private String b_name;//版块名称
    private String b_info;//版块简介
    private BigInteger b_clickNum;//版块点击量
    private BigInteger b_topicNum;//版块主贴量

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_info() {
        return b_info;
    }

    public void setB_info(String b_info) {
        this.b_info = b_info;
    }

    public BigInteger getB_clickNum() {
        return b_clickNum;
    }

    public void setB_clickNum(BigInteger b_clickNum) {
        this.b_clickNum = b_clickNum;
    }

    public BigInteger getB_topicNum() {
        return b_topicNum;
    }

    public void setB_topicNum(BigInteger b_topicNum) {
        this.b_topicNum = b_topicNum;
    }

    @Override
    public String toString() {
        return "Block{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_info='" + b_info + '\'' +
                ", b_clickNum=" + b_clickNum +
                ", b_topicNum=" + b_topicNum +
                '}';
    }
}
