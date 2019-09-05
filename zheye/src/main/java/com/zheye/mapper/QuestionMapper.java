package com.zheye.mapper;

import com.zheye.domain.Question;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;
import java.util.List;

public interface QuestionMapper {
    /**
     * 查询所有的问题
     * 无法转成json，待解决..
     * @return
     */
    List<Question> findAll2();

    @Results(value = {
           @Result(property = "id",column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "subject",column = "subject")
    })
    @Select("Select id,title,content,subject,readertimes readerTimes,agreetimes agreeTimes,disagresstimes disagressTimes from question where id=#{id}")
    Question findById2(int id);

    /**
     * 查询所有问题
     * @return
     */
    List<Question> findAll();

    //点赞减1
    @Update("Update question Set agreetimes=agreetimes-1 where id=#{id}")
    int agreeDown(int id);

    //点赞加1
    @Update("Update question Set agreetimes=agreetimes+1 where id=#{id}")
    int agreeUp(int id);

    //踩减1
    @Update("Update question Set disagresstimes=disagresstimes-1 where id=#{id}")
    int disagreDown(int id);

    //踩加1
    @Update("Update question Set disagresstimes=disagresstimes+1 where id=#{id}")
    int disagreUp(int id);
}
