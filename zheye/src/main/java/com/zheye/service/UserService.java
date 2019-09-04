package com.zheye.service;

import com.zheye.domain.UserInfo;
import com.zheye.mapper.UserInfoMapper;
import com.zheye.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class UserService {
    UserInfoMapper userInfoMapper;
    SqlSession sqlSession;


    public UserService(){
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
        UserInfo userInfo=userInfoMapper.findByPhone(phone);
        if (userInfo.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
