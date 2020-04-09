package com.cg.community.mapper;

import com.cg.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Question)表数据库访问层
 *
 * @author chenyumeng
 * @since 2020-03-12 09:22:37
 */
@Component
@Mapper
public interface QuestionMapper {

    /**
     * 创建问题
     *
     * @param question
     */
    @Insert("insert into question (title, description, gmt_create, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    void create(Question question);

    /**
     * 获取所以的提问信息
     *
     * @return
     */
    @Select("select * from question")
    List<Question> getQuestionList();

}