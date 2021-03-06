package com.diggmind.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TestModel
 *
 * @author Benny
 * @modified 2019-04-23
 * @copyright develop@diggmind.com
 * @lisence MIT
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestModel implements Serializable {

    /**
     * 测试ID
     */
    @JsonProperty("id")
    private int id;

    /**
     * 测试大图
     */
    @JsonProperty("img")
    private String img;

    /**
     * 测试小图
     */
    @JsonProperty("pic")
    private String pic;

    /**
     * 测试标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 测试简述
     */
    @JsonProperty("brief")
    private String brief;

    /**
     * 测试详情
     * （测评介绍、你将获得、适合谁测）
     */
    @JsonProperty("content")
    private String content;

    /**
     * 专业参数
     */
    @JsonProperty("content_parameter")
    private String contentParameter;

    /**
     * 报告样式
     */
    @JsonProperty("content_report")
    private String contentReport;

    /**
     * 参考文献
     */
    @JsonProperty("content_document")
    private String contentDocument;

    /**
     * 测评特色
     */
    @JsonProperty("content_feature")
    private String contentFeature;

    /**
     * 更新信息
     */
    @JsonProperty("content_update")
    private String contentUpdate;

    /**
     * 购买说明
     */
    @JsonProperty("content_policy")
    private String contentPolicy;

    /**
     * 是否需要角色信息
     */
    @JsonProperty("require_role")
    private int requireRole;

    /**
     * 是否需要人口信息
     */
    @JsonProperty("require_info")
    private int requireInfo;

    /**
     * 测试价格
     * channel.diggmind.com后台设置，此价格信息供参考，合作商可选择性采用
     */
    @JsonProperty("price")
    private BigDecimal price;

    /**
     * 测试促销价格
     * channel.diggmind.com后台设置，此价格信息供参考，合作商可选择性采用
     */
    @JsonProperty("discount_price")
    private BigDecimal discountPrice;

    /**
     * 平台基础价
     * Digg平台的基础售价，供参考
     */
    @JsonProperty("base_price")
    private BigDecimal basePrice;

    /**
     * 测试所属分类ID
     */
    @JsonProperty("category_id")
    private int categoryId;

    /**
     * 测试所属分类名称
     */
    @JsonProperty("category_name")
    private String categoryName;

    /**
     * 测试所属分类大图
     */
    @JsonProperty("category_img")
    private String categoryImg;

    /**
     * 测试所属分类小图
     */
    @JsonProperty("category_pic")
    private String categoryPic;

    /**
     * 测试所属分类简述
     */
    @JsonProperty("category_brief")
    private String categoryBrief;

    /**
     * 测试人数（供参考）
     */
    @JsonProperty("tested_num")
    private int testedNum;

    /**
     * 测试点赞数（供参考）
     */
    @JsonProperty("like_num")
    private int likeNum;

    /**
     * 最大测试次数
     */
    @JsonProperty("limit_time")
    private String limitTime;

    /**
     * 题目数（供参考）
     */
    @JsonProperty("question_num")
    private String questionNum;

    /**
     * 测试人数（供参考）
     */
    @JsonProperty("question_time")
    private String questionTime;


    /**
     * 平台分类ID（供参考）
     */
    @JsonProperty("base_category_id")
    private int baseCategoryId;

    /**
     * 平台分类名称（供参考）
     */
    @JsonProperty("base_category_name")
    private String baseCategoryName;

    /**
     * 平台分类描述（供参考）
     */
    @JsonProperty("base_category_brief")
    private String baseCategoryBrief;

    /**
     * 平台分类大图（供参考）
     */
    @JsonProperty("base_category_img")
    private String baseCategoryImg;

    /**
     * 平台分类小图（供参考）
     */
    @JsonProperty("base_category_pic")
    private String baseCategoryPic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentParameter() {
        return contentParameter;
    }

    public void setContentParameter(String contentParameter) {
        this.contentParameter = contentParameter;
    }

    public String getContentReport() {
        return contentReport;
    }

    public void setContentReport(String contentReport) {
        this.contentReport = contentReport;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryBrief() {
        return categoryBrief;
    }

    public void setCategoryBrief(String categoryBrief) {
        this.categoryBrief = categoryBrief;
    }

    public int getTestedNum() {
        return testedNum;
    }

    public void setTestedNum(int testedNum) {
        this.testedNum = testedNum;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public String getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(String limitTime) {
        this.limitTime = limitTime;
    }

    public int getBaseCategoryId() {
        return baseCategoryId;
    }

    public void setBaseCategoryId(int baseCategoryId) {
        this.baseCategoryId = baseCategoryId;
    }

    public String getBaseCategoryName() {
        return baseCategoryName;
    }

    public void setBaseCategoryName(String baseCategoryName) {
        this.baseCategoryName = baseCategoryName;
    }

    public String getBaseCategoryBrief() {
        return baseCategoryBrief;
    }

    public void setBaseCategoryBrief(String baseCategoryBrief) {
        this.baseCategoryBrief = baseCategoryBrief;
    }

    public String getBaseCategoryImg() {
        return baseCategoryImg;
    }

    public void setBaseCategoryImg(String baseCategoryImg) {
        this.baseCategoryImg = baseCategoryImg;
    }

    public String getBaseCategoryPic() {
        return baseCategoryPic;
    }

    public void setBaseCategoryPic(String baseCategoryPic) {
        this.baseCategoryPic = baseCategoryPic;
    }

    public int getRequireRole() {
        return requireRole;
    }

    public void setRequireRole(int requireRole) {
        this.requireRole = requireRole;
    }

    public int getRequireInfo() {
        return requireInfo;
    }

    public void setRequireInfo(int requireInfo) {
        this.requireInfo = requireInfo;
    }

    public String getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(String categoryImg) {
        this.categoryImg = categoryImg;
    }

    public String getCategoryPic() {
        return categoryPic;
    }

    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    public String getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(String questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(String questionTime) {
        this.questionTime = questionTime;
    }

    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public String getContentFeature() {
        return contentFeature;
    }

    public void setContentFeature(String contentFeature) {
        this.contentFeature = contentFeature;
    }

    public String getContentUpdate() {
        return contentUpdate;
    }

    public void setContentUpdate(String contentUpdate) {
        this.contentUpdate = contentUpdate;
    }

    public String getContentPolicy() {
        return contentPolicy;
    }

    public void setContentPolicy(String contentPolicy) {
        this.contentPolicy = contentPolicy;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", pic='" + pic + '\'' +
                ", title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                ", content='" + content + '\'' +
                ", contentParameter='" + contentParameter + '\'' +
                ", contentReport='" + contentReport + '\'' +
                ", contentDocument='" + contentDocument + '\'' +
                ", contentFeature='" + contentFeature + '\'' +
                ", contentUpdate='" + contentUpdate + '\'' +
                ", contentPolicy='" + contentPolicy + '\'' +
                ", requireRole=" + requireRole +
                ", requireInfo=" + requireInfo +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                ", basePrice=" + basePrice +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImg='" + categoryImg + '\'' +
                ", categoryPic='" + categoryPic + '\'' +
                ", categoryBrief='" + categoryBrief + '\'' +
                ", testedNum=" + testedNum +
                ", likeNum=" + likeNum +
                ", limitTime='" + limitTime + '\'' +
                ", questionNum='" + questionNum + '\'' +
                ", questionTime='" + questionTime + '\'' +
                ", baseCategoryId=" + baseCategoryId +
                ", baseCategoryName='" + baseCategoryName + '\'' +
                ", baseCategoryBrief='" + baseCategoryBrief + '\'' +
                ", baseCategoryImg='" + baseCategoryImg + '\'' +
                ", baseCategoryPic='" + baseCategoryPic + '\'' +
                '}';
    }

}
