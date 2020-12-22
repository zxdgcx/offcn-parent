package com.offcn.user.service;

import com.offcn.user.po.TMember;

public interface UserService {
    //注册用户 获取前端注册信息 存在member中
    public void registerUser(TMember member);

    //用户登录
    public TMember login(String username,String password);

    //根据用户id，获取用户信息
    public TMember findTmemberById(Integer id);
}
