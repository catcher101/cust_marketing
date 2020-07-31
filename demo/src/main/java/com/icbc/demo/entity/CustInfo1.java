package com.icbc.demo.entity;

public class CustInfo1 {

    private int id;
    private String recommend;
//    private String name;
    private String enName;
    private String primNat;
    private String gender;
    private String birthdate;
    private String phone1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getPrimNat() {
        return primNat;
    }


    public void setPrimNat(String primNat) {
        this.primNat = primNat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Override
    public String toString() {
        return "CustInfo1{" +
                "id=" + id +
                ", recommend='" + recommend + '\'' +
//                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                ", primNat='" + primNat + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", phone1='" + phone1 + '\'' +
                '}';
    }
}
