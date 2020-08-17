package com.icbc.demo.entity;

import java.io.Serializable;

public class ResultScore implements Serializable {
    /**
     * 
     */
    private String individualid;

    /**
     * 
     */
    private String scoreAge;

    /**
     * 
     */
    private String scoreBalance;

    /**
     * 
     */
    private String scoreDuration;

    /**
     * 
     */
    private String scoreCampaign;

    /**
     * 
     */
    private String scorePdays;

    /**
     * 
     */
    private String scorePrevious;

    private static final long serialVersionUID = 1L;

    public String getIndividualid() {
        return individualid;
    }

    public void setIndividualid(String individualid) {
        this.individualid = individualid == null ? null : individualid.trim();
    }

    public String getScoreAge() {
        return scoreAge;
    }

    public void setScoreAge(String scoreAge) {
        this.scoreAge = scoreAge == null ? null : scoreAge.trim();
    }

    public String getScoreBalance() {
        return scoreBalance;
    }

    public void setScoreBalance(String scoreBalance) {
        this.scoreBalance = scoreBalance == null ? null : scoreBalance.trim();
    }

    public String getScoreDuration() {
        return scoreDuration;
    }

    public void setScoreDuration(String scoreDuration) {
        this.scoreDuration = scoreDuration == null ? null : scoreDuration.trim();
    }

    public String getScoreCampaign() {
        return scoreCampaign;
    }

    public void setScoreCampaign(String scoreCampaign) {
        this.scoreCampaign = scoreCampaign == null ? null : scoreCampaign.trim();
    }

    public String getScorePdays() {
        return scorePdays;
    }

    public void setScorePdays(String scorePdays) {
        this.scorePdays = scorePdays == null ? null : scorePdays.trim();
    }

    public String getScorePrevious() {
        return scorePrevious;
    }

    public void setScorePrevious(String scorePrevious) {
        this.scorePrevious = scorePrevious == null ? null : scorePrevious.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", individualid=").append(individualid);
        sb.append(", scoreAge=").append(scoreAge);
        sb.append(", scoreBalance=").append(scoreBalance);
        sb.append(", scoreDuration=").append(scoreDuration);
        sb.append(", scoreCampaign=").append(scoreCampaign);
        sb.append(", scorePdays=").append(scorePdays);
        sb.append(", scorePrevious=").append(scorePrevious);
        sb.append("]");
        return sb.toString();
    }
}