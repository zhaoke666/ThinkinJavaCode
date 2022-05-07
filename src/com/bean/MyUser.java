package com.bean;

public class MyUser {
    private String name;

    private String password;

    private String id;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MyUser(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
