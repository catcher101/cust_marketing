package com.icbc.demo.entity;

import java.io.Serializable;

public class Result implements Serializable {
    /**
     * individualid
     */
    private String individualid;

    /**
     * xgb模型
     */
    private int xgbModelPred;

    /**
     * rfc模型
     */
    private int rfcModelPred;

    /**
     * lgb模型
     */
    private int lgbModelPred;

    /**
     * ada模型
     */
    private int adaModelPred;

    /**
     * mlp模型
     */
    private int mlpModelPred;

    /**
     * svm模型
     */
    private int svmModelPred;

    /**
     * knn模型
     */
    private int knnModelPred;

    private static final long serialVersionUID = 1L;

    public String getIndividualid() {
        return individualid;
    }

    public void setIndividualid(String individualid) {
        this.individualid = individualid == null ? null : individualid.trim();
    }

    public int getXgbModelPred() {
        return xgbModelPred;
    }

    public void setXgbModelPred(int xgbModelPred) {
        this.xgbModelPred = xgbModelPred;
    }

    public int getRfcModelPred() {
        return rfcModelPred;
    }

    public void setRfcModelPred(int rfcModelPred) {
        this.rfcModelPred = rfcModelPred;
    }

    public int getLgbModelPred() {
        return lgbModelPred;
    }

    public void setLgbModelPred(int lgbModelPred) {
        this.lgbModelPred = lgbModelPred;
    }

    public int getAdaModelPred() {
        return adaModelPred;
    }

    public void setAdaModelPred(int adaModelPred) {
        this.adaModelPred = adaModelPred;
    }

    public int getMlpModelPred() {
        return mlpModelPred;
    }

    public void setMlpModelPred(int mlpModelPred) {
        this.mlpModelPred = mlpModelPred;
    }

    public int getSvmModelPred() {
        return svmModelPred;
    }

    public void setSvmModelPred(int svmModelPred) {
        this.svmModelPred = svmModelPred;
    }

    public int getKnnModelPred() {
        return knnModelPred;
    }

    public void setKnnModelPred(int knnModelPred) {
        this.knnModelPred = knnModelPred;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", individualid=").append(individualid);
        sb.append(", xgbModelPred=").append(xgbModelPred);
        sb.append(", rfcModelPred=").append(rfcModelPred);
        sb.append(", lgbModelPred=").append(lgbModelPred);
        sb.append(", adaModelPred=").append(adaModelPred);
        sb.append(", mlpModelPred=").append(mlpModelPred);
        sb.append(", svmModelPred=").append(svmModelPred);
        sb.append(", knnModelPred=").append(knnModelPred);
        sb.append("]");
        return sb.toString();
    }
}