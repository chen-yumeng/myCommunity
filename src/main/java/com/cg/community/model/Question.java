package com.cg.community.model;

import lombok.Data;

import java.io.Serializable;

/**
 * (Question)实体类
 *
 * @author chenyumeng
 * @since 2020-03-12 09:22:34
 */
@Data
public class Question implements Serializable {
    private static final long serialVersionUID = -55080012388763726L;

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

}