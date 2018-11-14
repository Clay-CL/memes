package com.chiruhas.android.memes.Pojo;

public class MemeModel {
    String id;
    String name;
    String url;
    int width;
    int height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MemeModel(String id, String name, String url, int width, int height) {

        this.id = id;
        this.name = name;
        this.url = url;
        this.width = width;
        this.height = height;
    }
}