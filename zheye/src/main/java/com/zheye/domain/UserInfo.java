package com.zheye.domain;

import java.io.Serializable;
import java.sql.Date;

public class UserInfo implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String email;//邮箱
    private String phone;//电话
    private String sex;
    private Date jointime;
    private String habitation;//居住地
    private String profession;//所在行业
    private String proHistory;//职业经历
    private String eduExperience;//教育经历
    private String picture;//头像图片

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public String getHabitation() {
        return habitation;
    }

    public void setHabitation(String habitation) {
        this.habitation = habitation;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProHistory() {
        return proHistory;
    }

    public void setProHistory(String proHistory) {
        this.proHistory = proHistory;
    }

    public String getEduExperience() {
        return eduExperience;
    }

    public void setEduExperience(String eduExperience) {
        this.eduExperience = eduExperience;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", jointime=" + jointime +
                ", habitation='" + habitation + '\'' +
                ", profession='" + profession + '\'' +
                ", proHistory='" + proHistory + '\'' +
                ", eduExperience='" + eduExperience + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
