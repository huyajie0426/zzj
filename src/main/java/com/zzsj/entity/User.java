package com.zzsj.entity;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户实体类
 */
public class User {
    private BigInteger u_id;//用户id
    private String u_mini;//用户昵称
    private String u_realName;//用户真实姓名
    private String u_pwd;//用户密码
    private int sex;//性别
    private int jf;//用户积分
    private int u_level;//用户等级
    private int state;//状态
    private String phone;//手机号码
    private String email;//邮箱
    private String address;//地址
    private String headUrl;//头像地址
    private Date reg_time;//注册时间
    private BigInteger xp;//经验值


    public BigInteger getU_id() {
        return u_id;
    }

    public void setU_id(BigInteger u_id) {
        this.u_id = u_id;
    }

    public String getU_mini() {
        return u_mini;
    }

    public void setU_mini(String u_mini) {
        this.u_mini = u_mini;
    }

    public String getU_realName() {
        return u_realName;
    }

    public void setU_realName(String u_realName) {
        this.u_realName = u_realName;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getJf() {
        return jf;
    }

    public void setJf(int jf) {
        this.jf = jf;
    }

    public int getU_level() {
        return u_level;
    }

    public void setU_level(int u_level) {
        this.u_level = u_level;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public BigInteger getXp() {
        return xp;
    }

    public void setXp(BigInteger xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_mini='" + u_mini + '\'' +
                ", u_realName='" + u_realName + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", sex=" + sex +
                ", jf=" + jf +
                ", u_level=" + u_level +
                ", state=" + state +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", reg_time=" + reg_time +
                ", xp=" + xp +
                '}';
    }
}
