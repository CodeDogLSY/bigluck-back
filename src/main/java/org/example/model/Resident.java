package org.example.model;

public class Resident {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String name;
    private String gender;
    private String age;

    private String health_status;
    private String check_in_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getReason_for_stay() {
        return reason_for_stay;
    }

    public void setReason_for_stay(String reason_for_stay) {
        this.reason_for_stay = reason_for_stay;
    }

    private String birth_date;

    public Resident(String id,String name, String gender, String age, String health_status, String check_in_date, String birth_date, String reason_for_stay) {
        this.id= id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.health_status = health_status;
        this.check_in_date = check_in_date;
        this.birth_date = birth_date;
        this.reason_for_stay = reason_for_stay;
    }

    private String reason_for_stay;

}