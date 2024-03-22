package org.example.model;

public class Schedule {
    private String scheduleId;
    private String employeeName;
    private String shift;
    private String date;


    public Schedule(String scheduleId, String employeeName, String shift, String date) {
        this.scheduleId = scheduleId;
        this.employeeName = employeeName;
        this.shift = shift;
        this.date = date;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}