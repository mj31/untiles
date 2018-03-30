package com.mj.designpattern.observer;

import java.io.Serializable;

public class NewsModel implements Serializable {

    private String title ;

    private String content;

    public NewsModel(String title,String content){
        this.content=content;
        this.title=title;
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
}
