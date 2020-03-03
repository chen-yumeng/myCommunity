package com.cg.community.controllter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: community->HelloController
 * @description:
 * @author: cg
 * @create: 2020-03-03 09:01
 **/

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
