package com.zheye.domain;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer id;
    private Question question;//回答的问题
    private String content;
    private UserInfo user;//回答问题的人
    private Integer agreeTimes;//点赞数
    private Integer disagressTimes;//反对数

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

    public Integer getAgreeTimes() {
        return agreeTimes;
    }

    public void setAgreeTimes(Integer agreeTimes) {
        this.agreeTimes = agreeTimes;
    }

    public Integer getDisagressTimes() {
        return disagressTimes;
    }

    public void setDisagressTimes(Integer disagressTimes) {
        this.disagressTimes = disagressTimes;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question=" + question +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", agreeTimes=" + agreeTimes +
                ", disagressTimes=" + disagressTimes +
                '}';
    }
}
