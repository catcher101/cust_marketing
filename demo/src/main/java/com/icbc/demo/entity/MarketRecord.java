package com.icbc.demo.entity;

import java.io.Serializable;

public class MarketRecord implements Serializable {
    /**
     * id
     */
    private String individualid;

    /**
     * 姓名
     */
    private String name;

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
     * 距离上次活动最后一次联系该客户，过去了多久
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

    private static final long serialVersionUID = 1L;

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
        sb.append(", contact=").append(contact);
        sb.append(", day=").append(day);
        sb.append(", month=").append(month);
        sb.append(", duration=").append(duration);
        sb.append(", campaign=").append(campaign);
        sb.append(", pdays=").append(pdays);
        sb.append(", previous=").append(previous);
        sb.append(", poutcome=").append(poutcome);
        sb.append("]");
        return sb.toString();
    }
}