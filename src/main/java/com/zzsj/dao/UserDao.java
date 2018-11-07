package com.zzsj.dao;

import com.zzsj.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    //用户登录，返回需要的信息
    User LoginUser(@Param("user") User user);
    //用户注册
    int RegistUser(@Param("user")User user);
    //检测用户昵称是否存在
    int FindUserByName(@Param("u_mini") String u_mini);
    //更新用户经验值
    int updateUserXp(@Param("user")User user);



}
