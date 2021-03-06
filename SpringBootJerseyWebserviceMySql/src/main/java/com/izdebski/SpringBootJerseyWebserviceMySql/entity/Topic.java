package com.izdebski.SpringBootJerseyWebserviceMySql.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="topics")
public class Topic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="topic_id")
    private int topicId;

    @Column(name="title",nullable=false,length=100)
    private String title;

    @Column(name="category",nullable=false,length=200)
    private String category;

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }
    public int getTopicId() {
        return topicId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}