package org.example.model;

public class Activity {
    private String activityId;
    private String name;
    private String description;
    private String date;

    public Activity(String activityId, String name, String description, String date) {
        this.activityId = activityId;
        this.name = name;
        this.description = description;
        this.date = date;
    }

}
