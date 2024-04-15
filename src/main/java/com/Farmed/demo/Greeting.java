package com.Farmed.demo;


public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }



    public long setId(long id) {
        return this.id = id;
    }

    public long getId() {
        return id;
    }

    public String setContent(String content) {
        return this.content = content;
    }

    public String getContent() {
        return content;
    }
}