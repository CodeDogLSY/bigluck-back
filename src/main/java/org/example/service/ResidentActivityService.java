package org.example.service;

import org.example.dao.ResidentActivityMapper;
import org.example.model.ResidentActivity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentActivityService {
    private final ResidentActivityMapper residentActivityMapper;

    public ResidentActivityService(ResidentActivityMapper residentActivityMapper) {
        this.residentActivityMapper = residentActivityMapper;
    }

    public List<ResidentActivity> getAllResidentActivities() {
        return residentActivityMapper.getAllResidentActivities();
    }

    public List<ResidentActivity> getResidentActivitiesByResidentId(int residentId) {
        return residentActivityMapper.getResidentActivitiesByResidentId(residentId);
    }

    public List<ResidentActivity> getResidentActivitiesByActivityId(int activityId) {
        return residentActivityMapper.getResidentActivitiesByActivityId(activityId);
    }

    public void addResidentActivity(ResidentActivity residentActivity) {
        residentActivityMapper.addResidentActivity(residentActivity);
    }
}