package com.zheye.domain;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer id;
    private String content;
//    private UserInfo user;//回答问题的人
    private Integer userId;
    private Integer agreeTimes;//点赞数
    private Integer questionId;//回答的问题
    private Integer disagressTimes;//反对数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
                ", question=" + questionId +
                ", content='" + content + '\'' +
                ", user=" + userId +
                ", agreeTimes=" + agreeTimes +
                ", disagressTimes=" + disagressTimes +
                '}';
    }
}
