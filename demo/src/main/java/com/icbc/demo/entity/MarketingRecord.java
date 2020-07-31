package com.icbc.demo.entity;

public class MarketingRecord {
    private int marketingId;
    private int custId;
    private String marketTime;
    private String marketEffect;
    private String remark;

    public int getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(int marketingId) {
        this.marketingId = marketingId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getMarketTime() {
        return marketTime;
    }

    public void setMarketTime(String marketTime) {
        this.marketTime = marketTime;
    }

    public String getMarketEffect() {
        return marketEffect;
    }

    public void setMarketEffect(String marketEffect) {
        this.marketEffect = marketEffect;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MarketingRecord{" +
                "marketingId=" + marketingId +
                ", custId=" + custId +
                ", marketTime='" + marketTime + '\'' +
                ", marketEffect='" + marketEffect + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
