package com.icbc.demo.entity;

public class FeatureScore {
    private int custId;
    private int age;
    private int ageScore;
    private String profession;
    private int professionScore;
    private String education;
    private int educationScore;
    private String maritalStatus;
    private int maritalStatusScore;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeScore() {
        return ageScore;
    }

    public void setAgeScore(int ageScore) {
        this.ageScore = ageScore;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getProfessionScore() {
        return professionScore;
    }

    public void setProfessionScore(int professionScore) {
        this.professionScore = professionScore;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getEducationScore() {
        return educationScore;
    }

    public void setEducationScore(int educationScore) {
        this.educationScore = educationScore;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getMaritalStatusScore() {
        return maritalStatusScore;
    }

    public void setMaritalStatusScore(int maritalStatusScore) {
        this.maritalStatusScore = maritalStatusScore;
    }

    @Override
    public String toString() {
        return "FeatureScore{" +
                "custId=" + custId +
                ", age=" + age +
                ", ageScore=" + ageScore +
                ", profession='" + profession + '\'' +
                ", professionScore=" + professionScore +
                ", education='" + education + '\'' +
                ", educationScore=" + educationScore +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", maritalStatusScore=" + maritalStatusScore +
                '}';
    }
}
