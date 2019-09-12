package cn.thomaschen.twoidea.base;

public class BaseEntity {
    //人员ID
    private long personnelid;
    //活动ID
    private long activityid;
    //活动成果
    private String Achivements;
    //参与时间
    private String activityTime;

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

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }
}
