package com.cg.community.model;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-03-03 18:28:46
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 633540631158613175L;

    private Integer id;

    private String accountId;

    private String name;

    private String token;

    private String bio;

    private Long gmtCreate;

    private Long gmtModified;
}