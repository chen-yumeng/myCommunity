package com.cg.community.controllter;

import com.cg.community.mapper.UserMapper;
import com.cg.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: community->HelloController
 * @description:
 * @author: cg
 * @create: 2020-03-03 09:01
 **/

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies.length != 0) {
            for (Cookie cookie : cookies) {
                if ("token".equals(cookie.getName())) {
                    User user = userMapper.findByToken(cookie.getValue());
                    if (user != null) {
                        cookie.setMaxAge(3600);
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }
        return "index";
    }

}
