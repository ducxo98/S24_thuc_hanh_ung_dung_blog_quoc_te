package com.codegym.blog.request;

public class Credential {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Credential(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Credential() {
    }
}
