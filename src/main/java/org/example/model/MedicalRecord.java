package org.example.model;

/**
 * 医疗记录
 */
public class MedicalRecord {

    private String resident_id;
    private String health_condition;
    private String medical_history;
    private String medication;
    private String resident_name;

    public MedicalRecord(String resident_id, String health_condition, String medical_history, String medication) {
        this.resident_id = resident_id;
        this.health_condition = health_condition;
        this.medical_history = medical_history;
        this.medication = medication;
    }
    public MedicalRecord(String resident_id, String health_condition, String medical_history, String medication, String resident_name) {
        this.resident_id = resident_id;
        this.health_condition = health_condition;
        this.medical_history = medical_history;
        this.medication = medication;
        this.resident_name = resident_name;
    }

    public String getResident_id() {
        return resident_id;
    }

    public void setResident_id(String resident_id) {
        this.resident_id = resident_id;
    }

    public String getHealth_condition() {
        return health_condition;
    }

    public void setHealth_condition(String health_condition) {
        this.health_condition = health_condition;
    }

    public String getMedical_history() {
        return medical_history;
    }

    public void setMedical_history(String medical_history) {
        this.medical_history = medical_history;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getResident_name() {
        return resident_name;
    }

    public void setResident_name(String resident_name) {
        this.resident_name = resident_name;
    }
}