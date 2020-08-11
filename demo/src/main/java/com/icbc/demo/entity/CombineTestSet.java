package com.icbc.demo.entity;

import java.io.Serializable;

/**
 * 数据表combine_test_set对应的实体类
 */
public class CombineTestSet implements Serializable {
    /**
     * id
     */
    private String individualid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 缺省称呼
     */
    private String deltGreet;

    /**
     * 性别
     */
    private String gender;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 客户年龄
     */
    private String age;

    /**
     * 客户的职业
     */
    private String job;

    /**
     * 婚姻状况
     */
    private String marital;

    /**
     * 受教育水平
     */
    private String education;

    /**
     * 有没有违约
     */
    private String isviolaterule;

    /**
     * 每年账户的平均余额
     */
    private String balance;

    /**
     * 是否有住房贷款
     */
    private String housing;

    /**
     * 是否有个人贷款
     */
    private String loan;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 最后一次联系的时间（号）
     */
    private String day;

    /**
     * 最后一次联系的时间（月）
     */
    private String month;

    /**
     * 最后一次联系的交流时长（秒）
     */
    private String duration;

    /**
     * 本次活动中，与客户交流过的次数
     */
    private String campaign;

    /**
     * 距离上次活动最后一次联系该客户，过去了多久（999表示没联系过）
     */
    private String pdays;

    /**
     * 本次活动前，与客户交流过的次数
     */
    private String previous;

    /**
     * 上一次活动的结果（客户是否有购买上次活动营销的产品）
     */
    private String poutcome;

    /**
     * 是否推荐
     */
    private String isRecommend;

    private Result result;

    public String getPhoneshow() {
        return phoneshow;
    }

    public void setPhoneshow(String phoneshow) {
        this.phoneshow = phoneshow;
    }

    private String phoneshow;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    private Phone phone;

    private static final long serialVersionUID = 1L;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getIndividualid() {
        return individualid;
    }

    public void setIndividualid(String individualid) {
        this.individualid = individualid == null ? null : individualid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeltGreet() {
        return deltGreet;
    }

    public void setDeltGreet(String deltGreet) {
        this.deltGreet = deltGreet == null ? null : deltGreet.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getIsviolaterule() {
        return isviolaterule;
    }

    public void setIsviolaterule(String isviolaterule) {
        this.isviolaterule = isviolaterule == null ? null : isviolaterule.trim();
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing == null ? null : housing.trim();
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan == null ? null : loan.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign == null ? null : campaign.trim();
    }

    public String getPdays() {
        return pdays;
    }

    public void setPdays(String pdays) {
        this.pdays = pdays == null ? null : pdays.trim();
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous == null ? null : previous.trim();
    }

    public String getPoutcome() {
        return poutcome;
    }

    public void setPoutcome(String poutcome) {
        this.poutcome = poutcome == null ? null : poutcome.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", individualid=").append(individualid);
        sb.append(", name=").append(name);
        sb.append(", deltGreet=").append(deltGreet);
        sb.append(", gender=").append(gender);
        sb.append(", nationality=").append(nationality);
        sb.append(", age=").append(age);
        sb.append(", job=").append(job);
        sb.append(", marital=").append(marital);
        sb.append(", education=").append(education);
        sb.append(", isviolaterule=").append(isviolaterule);
        sb.append(", balance=").append(balance);
        sb.append(", housing=").append(housing);
        sb.append(", loan=").append(loan);
        sb.append(", contact=").append(contact);
        sb.append(", day=").append(day);
        sb.append(", month=").append(month);
        sb.append(", duration=").append(duration);
        sb.append(", campaign=").append(campaign);
        sb.append(", pdays=").append(pdays);
        sb.append(", previous=").append(previous);
        sb.append(", poutcome=").append(poutcome);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", result=").append(result);
        sb.append(" ]");
        return sb.toString();
    }
}