package com.xrom.ssh.service;

import com.xrom.ssh.entity.UserLogin;

import java.util.List;

public interface IUserService {

    List<UserLogin> getUserList();
}
