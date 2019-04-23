package com.diggmind.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * TestQuestionOptionRadio
 *
 * @author Benny
 * @modified 2019-04-23
 * @copyright develop@diggmind.com
 * @lisence MIT
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestQuestionOptionRadio implements Serializable{

    /**
     * 选项ID
     */
    @JsonProperty("id")
    private int id;

    /**
     * 选项标题
     */
    @JsonProperty("title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestQuestionOptionRadio{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

