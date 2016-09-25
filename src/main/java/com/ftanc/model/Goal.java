package com.ftanc.model;

/**
 * Created by ftanc on 25/09/2016.
 */
public class Goal {
    private int id;
    private String content;

    public Goal(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
