package org.example.model;

public class DietaryPreferences {
    private int id;
    private int residentId;
    private String dietaryPreferences;
    private String dietaryRestrictions;

    public DietaryPreferences(int id, int residentId, String dietaryPreferences, String dietaryRestrictions) {
        this.id = id;
        this.residentId = residentId;
        this.dietaryPreferences = dietaryPreferences;
        this.dietaryRestrictions = dietaryRestrictions;
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

    public String getDietaryPreferences() {
        return dietaryPreferences;
    }

    public void setDietaryPreferences(String dietaryPreferences) {
        this.dietaryPreferences = dietaryPreferences;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }
}