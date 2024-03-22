package org.example.service;

import org.example.dao.ResidentActivityRegistrationMapper;
import org.example.model.ResidentActivityRegistration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentActivityRegistrationService {
    private final ResidentActivityRegistrationMapper registrationMapper;

    public ResidentActivityRegistrationService(ResidentActivityRegistrationMapper registrationMapper) {
        this.registrationMapper = registrationMapper;
    }

    public void registerResidentForActivity(ResidentActivityRegistration registration) {
        registrationMapper.registerResidentForActivity(registration);
    }

    public List<ResidentActivityRegistration> getRegistrationsForActivity(String activityId) {
        return registrationMapper.getRegistrationsForActivity(activityId);
    }

    public List<ResidentActivityRegistration> getAllRegistrations() {
        return registrationMapper.getAllRegistrations();
    }
}