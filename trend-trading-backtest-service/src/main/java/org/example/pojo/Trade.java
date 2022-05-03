package org.example.pojo;

public class Trade {
    private String buyDate; //买入日期
    private String sellDate; //售出日期
    private float buyClosePoint; //买入的收盘价
    private float sellClosePoint;//售出的收盘价
    private float rate;//盈利比率

    public String getBuyDate() {
        return buyDate;
    }
    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }
    public String getSellDate() {
        return sellDate;
    }
    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }
    public float getBuyClosePoint() {
        return buyClosePoint;
    }
    public void setBuyClosePoint(float buyClosePoint) {
        this.buyClosePoint = buyClosePoint;
    }
    public float getSellClosePoint() {
        return sellClosePoint;
    }
    public void setSellClosePoint(float sellClosePoint) {
        this.sellClosePoint = sellClosePoint;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }

}
