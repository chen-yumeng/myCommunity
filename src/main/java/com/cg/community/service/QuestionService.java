package com.cg.community.service;

import com.cg.community.dto.QuestionDto;

import java.util.List;

/**
 * @program: community->QuestionService
 * @description:
 * @author: cg
 * @create: 2020-04-09 11:01
 **/
public interface QuestionService {

    /**
     * 首页获取所有提问信息（带有用户信息）
     *
     * @return
     */
    List<QuestionDto> getQuestionList();
}
