package com.zheye.mapper;

import com.zheye.domain.Question;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QuestionMapper {
    /**
     * 查询所有的问题
     * @return
     */
    List<Question> findAll();

    @Results(value = {
           @Result(property = "id",column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "subject",column = "subject")
    })
    @Select("Select id,title,content,subject,readertimes readerTimes,agreetimes agreeTimes,disagresstimes disagressTimes from question where id=#{id}")
    Question findById2(int id);
}
