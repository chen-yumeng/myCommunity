package com.cg.community.dto;

import com.cg.community.model.User;
import lombok.Data;

/**
 * 用户提问信息
 *
 * @program: community->QuestionDto
 * @description:
 * @author: cg
 * @create: 2020-04-09 10:59
 **/

@Data
public class QuestionDto {
    private Integer id;

    private String title;

    private String description;

    private Long gmtCreate;

    private Long gmtModified;

    private Integer creator;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    private String tag;

    private User user;
}
