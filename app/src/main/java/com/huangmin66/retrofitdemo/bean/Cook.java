package com.huangmin66.retrofitdemo.bean;

import com.google.gson.annotations.SerializedName;

/**
 * 描述：
 * 作者： 天天童话丶
 * 时间： 2017/4/19.
 */
public class Cook {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;//名称
    @SerializedName("food")
    private String  food;//食物
    @SerializedName("img")
    private String img;//图片
    @SerializedName("images")
    private String images;//图片,
    @SerializedName("description")
    private String description;//描述
    @SerializedName("keywords")
    private String keywords;//关键字
    @SerializedName("message")
    private String message;//资讯内容
    @SerializedName("count")
    private int count ;//访问次数
    @SerializedName("fcount")
    private int fcount;//收藏数
    @SerializedName("rcount")
    private int rcount;//评论读数

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

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }
}
