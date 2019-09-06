package com.zheye.service;

import com.zheye.domain.Question;
import com.zheye.mapper.QuestionMapper;
import com.zheye.mapper.UserInfoMapper;
import com.zheye.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    private QuestionMapper questionMapper;
    private SqlSession sqlSession;



    public void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        questionMapper=sqlSession.getMapper(QuestionMapper.class);
    }

    public List<Question> findAll(){
        init();
        List<Question> list = questionMapper.findAll2();
        SqlSessionUtil.close(sqlSession);
        return list;
    }
}
