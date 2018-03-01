package com.xrom.ssh.controller;

import com.xrom.ssh.entity.UserLogin;
import com.xrom.ssh.service.IUserService;
import com.xrom.ssh.vo.ExecResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/userList")
    @ResponseBody
    public ExecResult getAll(){
        ExecResult result = new ExecResult();
        List<UserLogin> userList = this.userService.getUserList();
        if(userList == null){
            result.setData(null);
            result.setMsg("false");
            result.setSuccess(false);
            return result;
        }
        result.setData(userList);
        result.setMsg("true");
        result.setSuccess(true);
        return result;
    }

}
