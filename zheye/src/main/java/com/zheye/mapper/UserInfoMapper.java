package com.zheye.mapper;

import com.zheye.domain.UserInfo;
import org.apache.ibatis.annotations.*;

public interface UserInfoMapper {
    /**
     * 添加用户
     * @param userInfo 用户信息
     * @return 影响行数
     */
    @Insert("Insert Into userinfo Values(null,#{name},#{password},#{email},#{phone}," +
            "#{sex},#{jointime},#{habitation},#{profession}," +
            "#{proHistory},#{eduExperience},#{picture})")
    int addUser(UserInfo userInfo);

    /**
     * 查询单个用户
     * @param phone 电话号码
     * @return 用户信息
     */
    @Results(value={
        @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "password",column = "password"),
            @Result(property = "email",column = "email"),
            @Result(property = "phone",column = "phone"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "jointime",column = "jointime"),
            @Result(property = "habitation",column = "habitation"),
            @Result(property = "profession",column = "profession"),
            @Result(property = "proHistory",column = "pro_history"),
            @Result(property = "eduExperience",column = "edu_experience"),
            @Result(property = "picture",column = "picture")
    })
    @Select("Select * from userinfo where phone=#{phone}")
    UserInfo findByPhone(@Param("phone") String phone);
}
