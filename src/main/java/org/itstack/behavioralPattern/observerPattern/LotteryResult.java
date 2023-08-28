package org.itstack.behavioralPattern.observerPattern;

import java.util.Date;

public class LotteryResult {
    String uId;
    String lottery;
    Date date;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getLottery() {
        return lottery;
    }

    public void setLottery(String lottery) {
        this.lottery = lottery;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LotteryResult(String uId, String lottery, Date date) {
        this.uId = uId;
        this.lottery = lottery;
        this.date = date;
    }
}
