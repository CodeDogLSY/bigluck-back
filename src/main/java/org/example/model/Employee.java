package org.example.model;

public class Employee {
    private String employeeNumber;
    private String name;
    private String position;
    private String contact;

    public Employee(String employeeNumber, String name, String position, String contact) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.position = position;
        this.contact = contact;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}