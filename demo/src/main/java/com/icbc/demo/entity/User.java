package com.icbc.demo.entity;

public class User {
    private int id;//用户id
    private String username;//用户名
    private String password;//密码
    private String isManager;//是否为管理员

    public User() {
    }

    public User(int id, String username, String password, String isManager) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isManager = isManager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isManager=" + isManager +
                '}';
    }
}
