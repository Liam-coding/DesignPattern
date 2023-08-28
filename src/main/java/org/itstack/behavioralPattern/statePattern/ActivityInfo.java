package org.itstack.behavioralPattern.statePattern;

import java.util.Date;

public class ActivityInfo {
    private String activityId;
    private String activityName;
    private Enum<Status> status;
    private Date beginTime;
    private Date endTime;

    public ActivityInfo() {
    }

    public ActivityInfo(String activityId, String activityName, Enum<Status> status, Date beginTime, Date endTime) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.status = status;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setStatus(Enum<Status> status) {
        this.status = status;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
