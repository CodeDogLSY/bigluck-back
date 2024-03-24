package org.example.model;

public class ResidentActivity {
    private int id;
    private int residentId;
    private int activityId;
    private String feedback;
    private String activityName;
    private String activityDate;

    public ResidentActivity(int id, int residentId, int activityId, String feedback) {
        this.id = id;
        this.residentId = residentId;
        this.activityId = activityId;
        this.feedback = feedback;
    }
    public ResidentActivity(int id, int residentId, int activityId, String feedback,String activityName,String activityDate) {
        this.id = id;
        this.residentId = residentId;
        this.activityId = activityId;
        this.feedback = feedback;
        this.activityName = activityName;
        this.activityDate = activityDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }
}
