package com.cg.community.controllter;

import com.cg.community.mapper.QuestionMapper;
import com.cg.community.mapper.UserMapper;
import com.cg.community.model.Question;
import com.cg.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: community->PublishController
 * @description:
 * @author: cg
 * @create: 2020-03-11 21:12
 **/
@Controller
public class PublishController {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("publish")
    public String publish() {
        return "publish";
    }

    @PostMapping("publish")
    public String toPublish(@RequestParam(name = "title") String title,
                            @RequestParam(name = "description") String description,
                            @RequestParam(name = "tag") String tag,
                            @CookieValue(name = "token") String token,
                            HttpServletRequest request,
                            Model model) {
        User user = userMapper.findByToken(token);
        Question question = new Question();
        question.setTitle(title);
        question.setTag(tag);
        question.setDescription(description);
        question.setCreator(user.getId());
        question.setGmtCreate(System.currentTimeMillis());
        question.setGmtModified(question.getGmtCreate());
        questionMapper.create(question);
        return "redirect:/";
    }

}
