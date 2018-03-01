package com.xrom.ssh.dao.impl;

import com.xrom.ssh.dao.BaseDao;
import com.xrom.ssh.dao.IUserDao;
import com.xrom.ssh.entity.UserLogin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl extends BaseDao implements IUserDao {

    @Override
    public List<UserLogin> queryUser() {
        Session session = getSession();
        Query query = session.createQuery("from User");
        return query.list();
    }
}
