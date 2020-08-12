package com.icbc.demo.entity;

public class Phone {

    private String individualid;

    private String phoneNumber;

    public String getIndividualid() {
        return individualid;
    }

    public void setIndividualid(String individualid) {
        this.individualid = individualid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "individualid='" + individualid + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
