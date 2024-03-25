package org.example.model;

public class Schedule {
    private String id;
    private String schedule_date;
    private String employee_id;
    private String employee_name;

    public Schedule(String id, String employee_id, String schedule_date) {
        this.id = id;
        this.employee_id = employee_id;
        this.schedule_date = schedule_date;
    }
    public Schedule(String id, String employee_id, String employee_name, String schedule_date) {
        this.id = id;
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.schedule_date = schedule_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getSchedule_date() {
        return schedule_date;
    }

    public void setSchedule_date(String schedule_date) {
        this.schedule_date = schedule_date;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
}