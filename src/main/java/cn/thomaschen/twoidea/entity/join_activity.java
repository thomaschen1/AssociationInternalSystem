package cn.thomaschen.twoidea.entity;

import java.util.Date;

public class join_activity {
    //记录ID
    private long id;
    //人员ID
    private long personnelid;
    //活动ID
    private long activityid;
    //活动成果
    private String Achivements;
    //参与时间
    private String activityTime;

    private manage_people managepeople;

    private manage_activity manageactivity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(long personnelid) {
        this.personnelid = personnelid;
    }

    public long getActivityid() {
        return activityid;
    }

    public void setActivityid(long activityid) {
        this.activityid = activityid;
    }

    public String getAchivements() {
        return Achivements;
    }

    public void setAchivements(String achivements) {
        Achivements = achivements;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivity_time(String activityTime) {
        this.activityTime = activityTime;
    }

    @Override
    public String toString() {
        return "join_activity{" +
                "id=" + id +
                ", personnelid=" + personnelid +
                ", activityid=" + activityid  +
                ", Achivements='" + Achivements + '\'' +
                ", activityTime=" + activityTime +
                '}';
    }
}
