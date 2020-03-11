package com.cg.community.controllter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: community->PublishController
 * @description:
 * @author: cg
 * @create: 2020-03-11 21:12
 **/
@Controller
public class PublishController {

    @RequestMapping("publish")
    public String publish() {
        return "publish";
    }

}
