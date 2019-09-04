package com.zheye.service;

import com.zheye.domain.UserInfo;
import com.zheye.mapper.UserInfoMapper;
import com.zheye.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class UserService {
    private UserInfoMapper userInfoMapper;
    private SqlSession sqlSession;


    public void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
    }

    /**
     * 验证用户密码是否正确
     * @param phone 手机号
     * @param password  密码
     * @return  (true or false)
     */
    public boolean checkUser(String phone,String password){
        init();
        UserInfo userInfo=userInfoMapper.findByPhone(phone);
        if(userInfo==null){
            return false;
        }
        if (userInfo.getPassword().equals(password)){
            return true;
        }
        SqlSessionUtil.close(sqlSession);
        return false;
    }

    /**
     * 查询是否有该用户
     * @param phone
     * @return
     */
    public UserInfo findByPhone(String phone){
        init();
        UserInfo userInfo=userInfoMapper.findByPhone(phone);
        SqlSessionUtil.close(sqlSession);
        return userInfo;
    }
}
