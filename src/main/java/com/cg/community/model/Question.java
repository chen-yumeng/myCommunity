package com.cg.community.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
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

    @NotBlank(message = "标题不能为空!")
    private String title;

    @NotBlank(message = "描述不能为空!")
    private String description;

    private Long gmtCreate;

    private Long gmtModified;

    private Integer creator;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    @NotBlank(message = "标签不能为空!")
    private String tag;

}