package com.zheye.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Question implements Serializable {
    private Integer id;
    private String title;//问题标题
    private String content;//问题内容
    private Date createtime;
//    private UserInfo questioner;
    private Integer questionerId;//问题人id
    private Integer subject;//所属主题
    private List<Answer> answers;//问题的回答集合
    private Integer readerTimes;//阅读数
    private Integer agreeTimes;//点赞数
    private Integer disagressTimes;//反对数

    public Integer getQuestionerId() {
        return questionerId;
    }

    public void setQuestionerId(Integer questionerId) {
        this.questionerId = questionerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

//    public UserInfo getQuestioner() {
//        return questioner;
//    }
//
//    public void setQuestioner(UserInfo questioner) {
//        this.questioner = questioner;
//    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Integer getReaderTimes() {
        return readerTimes;
    }

    public void setReaderTimes(Integer readerTimes) {
        this.readerTimes = readerTimes;
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
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createtime=" + createtime +
                ", questionerId=" + questionerId +
                ", subject=" + subject +
                ", answers=" + answers +
                ", readerTimes=" + readerTimes +
                ", agreeTimes=" + agreeTimes +
                ", disagressTimes=" + disagressTimes +
                '}';
    }
}
