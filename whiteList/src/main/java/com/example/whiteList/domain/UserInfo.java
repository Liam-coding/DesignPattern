package com.example.whiteList.domain;

public class UserInfo {
    private String name;
    private Integer age;
    private String address;
    private String code;
    private String info;

    public UserInfo(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
