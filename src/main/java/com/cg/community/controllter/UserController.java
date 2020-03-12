package com.cg.community.controllter;

import com.cg.community.dto.Result;
import com.cg.community.mapper.UserMapper;
import com.cg.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: community->UserController
 * @description:
 * @author: cg
 * @create: 2020-03-12 22:05
 **/
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @GetMapping("getUserIsLogin")
    public Result getUserIsLogin(HttpServletRequest request) {
        if (request.getSession().getAttribute("user") != null) {
            return Result.ok();
        }
        return Result.build(202, "请先登录！");
    }

    //TODO:开发期间临时登录方式
    @GetMapping("login")
    public String login(HttpServletRequest request) {
        User user = userMapper.getUser();
        request.getSession().setAttribute("user", user);
        return "redirect:/";
    }

}
