package com.cg.community.mapper;

import com.cg.community.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-03 18:28:47
 */
@Component
@Mapper
public interface UserMapper {

    /**
     * 插入一个用户信息
     *
     * @param user
     */
    @Insert("insert into user(account_id, name, token, gmt_create, gmt_modified, avatar_url) values (#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified}, #{avatarUrl})")
    void insert(User user);

    /**
     * 通过 token 查询用户信息
     * @param token
     * @return
     */
    @Select("select * from user where user.token=#{token}")
    User findByToken(String token);

    //TODO:开发阶段的临时登录方式
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "account_id", property = "accountId"),
            @Result(column = "name", property = "name"),
            @Result(column = "token", property = "token"),
            @Result(column = "bio", property = "bio"),
            @Result(column = "gmt_create", property = "gmtCreate"),
            @Result(column = "gmt_modified", property = "gmtModified"),
            @Result(column = "avatar_url", property = "avatarUrl"),
    })
    @Select("select id,account_id,name,token,bio,gmt_create,gmt_modified,avatar_url from user where id=17")
    User getUser();

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    @Select("select * from user")
    List<User> getAllUser();

}