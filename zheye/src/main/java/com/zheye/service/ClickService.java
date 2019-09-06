package com.zheye.service;

import com.zheye.mapper.QuestionMapper;
import com.zheye.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class ClickService {
    SqlSession sqlSession;
    QuestionMapper questionMapper;


    //点赞+1
    public void queAgreeUp(int id){
        sqlSession=SqlSessionUtil.getSqlSession();
        questionMapper=sqlSession.getMapper(QuestionMapper.class);
        questionMapper.agreeUp(id);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
    }
    //点赞-1
    public void queAgreeDown(int id){
        sqlSession=SqlSessionUtil.getSqlSession();
        questionMapper=sqlSession.getMapper(QuestionMapper.class);
        questionMapper.agreeDown(id);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
    }
    //踩+1
    public void queDisagreUp(int id){
        sqlSession=SqlSessionUtil.getSqlSession();
        questionMapper=sqlSession.getMapper(QuestionMapper.class);
        questionMapper.disagreUp(id);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
    }
    //踩-1
    public void queDisagreDown(int id){
        sqlSession=SqlSessionUtil.getSqlSession();
        questionMapper=sqlSession.getMapper(QuestionMapper.class);
        questionMapper.disagreDown(id);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
    }
}
