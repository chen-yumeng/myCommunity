package com.cg.community.service.impl;

import com.cg.community.dto.QuestionDto;
import com.cg.community.mapper.QuestionMapper;
import com.cg.community.mapper.UserMapper;
import com.cg.community.model.Question;
import com.cg.community.model.User;
import com.cg.community.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: community->QuestionServiceImpl
 * @description:
 * @author: cg
 * @create: 2020-04-09 11:05
 **/
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<QuestionDto> getQuestionList() {
        List<Question> questions = questionMapper.getQuestionList();
        List<User> users = userMapper.getAllUser();
        List<QuestionDto> list = new ArrayList<>();
        for (Question question : questions) {
            QuestionDto questionDto = new QuestionDto();
            BeanUtils.copyProperties(question, questionDto);
            for (User user : users) {
                if (question.getCreator().equals(user.getId())) {
                    questionDto.setUser(user);
                    break;
                }
            }
            list.add(questionDto);
        }
        return list;
    }
}
