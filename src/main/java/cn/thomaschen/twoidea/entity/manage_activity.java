package cn.thomaschen.twoidea.entity;

import java.util.Date;

public class manage_activity {
    //id
    private long id;
    //活动ID
    private long activityID;
    //活动名字
    private String name;
    //活动类型
    private String type;
    //活动负责人
    private String functionaary;
    //活动负责人电话号
    private String phoneNumber;
    //活动开始时间
    private String starTime;
    //活动结束时间
    private String endTime;
    //活动地点
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

    public long getActivityID() {
        return activityID;
    }

    public void setActivityID(Long activityID) {
        this.activityID = activityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFunctionaary() {
        return functionaary;
    }

    public void setFunctionaary(String functionaary) {
        this.functionaary = functionaary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "manage_activity{" +
                "id=" + id +
                ", activityID=" + activityID +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", functionaary='" + functionaary + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", star_time=" + starTime +
                ", end_time=" + endTime +
                ", location='" + location + '\'' +
                '}';
    }
}
