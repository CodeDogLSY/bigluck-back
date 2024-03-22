package org.example.model;

public class ResidentActivityRegistration {
    private String registrationId;
    private String residentId;
    private String activityId;

    public ResidentActivityRegistration(String registrationId, String residentId, String activityId) {
        this.registrationId = registrationId;
        this.residentId = residentId;
        this.activityId = activityId;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
}
