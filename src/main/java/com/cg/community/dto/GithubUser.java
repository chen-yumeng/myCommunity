package com.cg.community.dto;

import lombok.Data;

/**
 * @program: community->GithubUser
 * @description:
 * @author: cg
 * @create: 2020-03-03 11:41
 **/
@Data
public class GithubUser {

    private String name;

    private Long id;

    private String bio;

    private String avatar_url;

}
