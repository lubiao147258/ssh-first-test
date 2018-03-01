package com.xrom.ssh.service.impl;

import com.xrom.ssh.dao.IUserDao;
import com.xrom.ssh.entity.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.xrom.ssh.service.IUserService;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserLogin> getUserList() {
        return userDao.queryUser();
    }
}
