package com.icbc.demo.entity;

public class Phone {

    private int individualid;

    private String phoneNumber;

    public int getIndividualid() {
        return individualid;
    }

    public void setIndividualid(int individualid) {
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
