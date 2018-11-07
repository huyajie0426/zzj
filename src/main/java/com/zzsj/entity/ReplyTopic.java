package com.zzsj.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * 回帖
 */
public class ReplyTopic {
    private BigInteger t_id;//帖子id
    private BigInteger TID;//数据库唯一标识
    private int b_id;//版块号
    private BigInteger topic_id;//回复的帖子id
    private BigInteger replyer_id;//回复者id
    private BigInteger receiver_id;//收到回复信息者id
    private String replyTxt;//回复内容
    private Date replyTime;//回复时间

    public BigInteger getT_id() {
        return t_id;
    }

    public void setT_id(BigInteger t_id) {
        this.t_id = t_id;
    }

    public BigInteger getTID() {
        return TID;
    }

    public void setTID(BigInteger TID) {
        this.TID = TID;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public BigInteger getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(BigInteger topic_id) {
        this.topic_id = topic_id;
    }

    public BigInteger getReplyer_id() {
        return replyer_id;
    }

    public void setReplyer_id(BigInteger replyer_id) {
        this.replyer_id = replyer_id;
    }

    public BigInteger getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(BigInteger receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getReplyTxt() {
        return replyTxt;
    }

    public void setReplyTxt(String replyTxt) {
        this.replyTxt = replyTxt;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    @Override
    public String toString() {
        return "ReplyTopic{" +
                "t_id=" + t_id +
                ", TID=" + TID +
                ", b_id=" + b_id +
                ", topic_id=" + topic_id +
                ", replyer_id=" + replyer_id +
                ", receiver_id=" + receiver_id +
                ", replyTxt='" + replyTxt + '\'' +
                ", replyTime=" + replyTime +
                '}';
    }
}
