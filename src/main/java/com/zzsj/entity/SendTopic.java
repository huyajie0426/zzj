package com.zzsj.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户发帖
 */
public class SendTopic {
    private BigInteger TID;//数据库中唯一标识
    private Integer b_id;//版块id
    private BigInteger u_id;//用户id
    private BigInteger topic_id;//帖子id
    private BigInteger backNum;//帖子回复数
    private String title;//帖子主题
    private String mainTxt;//正文
    private BigInteger clickNum;//点击量
    private Date lastBackTime;//最后回复时间
    private int topic_state;//帖子状态

    public BigInteger getTID() {
        return TID;
    }

    public void setTID(BigInteger TID) {
        this.TID = TID;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public BigInteger getU_id() {
        return u_id;
    }

    public void setU_id(BigInteger u_id) {
        this.u_id = u_id;
    }

    public BigInteger getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(BigInteger topic_id) {
        this.topic_id = topic_id;
    }

    public BigInteger getBackNum() {
        return backNum;
    }

    public void setBackNum(BigInteger backNum) {
        this.backNum = backNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainTxt() {
        return mainTxt;
    }

    public void setMainTxt(String mainTxt) {
        this.mainTxt = mainTxt;
    }

    public BigInteger getClickNum() {
        return clickNum;
    }

    public void setClickNum(BigInteger clickNum) {
        this.clickNum = clickNum;
    }

    public Date getLastBackTime() {
        return lastBackTime;
    }

    public void setLastBackTime(Date lastBackTime) {
        this.lastBackTime = lastBackTime;
    }

    public int getTopic_state() {
        return topic_state;
    }

    public void setTopic_state(int topic_state) {
        this.topic_state = topic_state;
    }

    @Override
    public String toString() {
        return "SendTopic{" +
                "TID=" + TID +
                ", b_id=" + b_id +
                ", u_id=" + u_id +
                ", topic_id=" + topic_id +
                ", backNum=" + backNum +
                ", title='" + title + '\'' +
                ", mainTxt='" + mainTxt + '\'' +
                ", clickNum=" + clickNum +
                ", lastBackTime=" + lastBackTime +
                ", topic_state=" + topic_state +
                '}';
    }
}
