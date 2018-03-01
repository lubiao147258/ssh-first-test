package com.xrom.ssh.dao;

import com.xrom.ssh.entity.UserLogin;

import java.util.List;

public interface IUserDao {

    List<UserLogin> queryUser();
}
