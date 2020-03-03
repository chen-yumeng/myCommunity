package com.cg.community.controllter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: community->HelloController
 * @description:
 * @author: cg
 * @create: 2020-03-03 09:01
 **/

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
