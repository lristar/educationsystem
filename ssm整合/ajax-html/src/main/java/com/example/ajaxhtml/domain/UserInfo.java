package com.example.ajaxhtml.domain;

public class UserInfo {
    private String name;
    private String dpassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpassword() {
        return dpassword;
    }

    public void setDpassword(String dpassword) {
        this.dpassword = dpassword;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", dpassword='" + dpassword + '\'' +
                '}';
    }
}
