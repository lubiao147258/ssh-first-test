package com.xrom.ssh.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "forum_user_login")
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 2708617845949468284L;

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "uuidGen", strategy = "uuid")
    @GeneratedValue(generator = "uuidGen")
    private String id;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 角色
     * 0 普通用户
     * 1 管理员
     */
    @Column(name = "role")
    private Integer role;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
