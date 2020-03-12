package com.cg.community.mapper;

import com.cg.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-03 18:28:47
 */
@Component
@Mapper
public interface UserMapper {

    @Insert("insert into user(account_id, name, token, gmt_create, gmt_modified) values (#{accountId}, #{name}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);

    @Select("select * from user where user.token=#{token}")
    User findByToken(String token);
}