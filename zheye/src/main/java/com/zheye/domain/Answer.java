package com.zheye.domain;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer id;
    private Question question;//回答的问题
    private String content;
    private UserInfo user;//回答问题的人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}
