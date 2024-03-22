package org.example.service;

import org.example.dao.ActivityMapper;
import org.example.model.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    private final ActivityMapper activityMapper;

    public ActivityService(ActivityMapper activityMapper) {
        this.activityMapper = activityMapper;
    }

    public List<Activity> getAllActivities() {
        return activityMapper.getAllActivities();
    }
}