package com.example.mybatisdemo.entity;

/**
 * PaclageName com.example.mybatisdemo.entity
 *
 * @Created on  2020/5/19 0019
 * @Author xumingming
 * @DDesrciption
 */
public class User {
    private String UserName;

    private Integer id;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
