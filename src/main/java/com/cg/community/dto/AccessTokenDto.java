package com.cg.community.dto;

import lombok.Data;

/**
 * 接受GitHub的授权登录信息
 * @program: community->AccessTokenDto
 * @description:
 * @author: cg
 * @create: 2020-03-03 11:16
 **/
@Data
public class AccessTokenDto {

    private String client_id;

    private String client_secret;

    private String code;

    private String redirect_uri;

    private String state;
}
