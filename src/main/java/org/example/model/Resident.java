package org.example.model;

public class Resident {
    private String residentId;
    private String name;
    private String address;
    private String contact;

    public Resident(String residentId, String name, String address, String contact) {
        this.residentId = residentId;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}