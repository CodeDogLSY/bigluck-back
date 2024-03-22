package org.example.model;

public class ResidentActivity {
    private int id;
    private int residentId;
    private int activityId;
    private String feedback;

    public ResidentActivity(int id, int residentId, int activityId, String feedback) {
        this.id = id;
        this.residentId = residentId;
        this.activityId = activityId;
        this.feedback = feedback;
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
}
