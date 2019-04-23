package com.diggmind.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * TestInfoModel
 *
 * @author Benny
 * @modified 2019-04-23
 * @copyright develop@diggmind.com
 * @lisence MIT
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestInfoModel {

    /**
     * 人口信息ID
     */
    @JsonProperty("id")
    private int id;

    /**
     * 人口信息名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 人口信息代码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 人口信息类型
     */
    @JsonProperty("type")
    private String type;

    /**
     * 人口信息选项
     */
    @JsonProperty("options")
    private ArrayList<TestInfoOptionModel> options;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<TestInfoOptionModel> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<TestInfoOptionModel> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "TestInfoModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", options=" + options +
                '}' + '\n';
    }

}