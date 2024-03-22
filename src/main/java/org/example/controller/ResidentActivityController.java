package org.example.controller;

import org.example.model.ResidentActivity;
import org.example.service.ResidentActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/residentActivities")
public class ResidentActivityController {
    private final ResidentActivityService residentActivityService;

    public ResidentActivityController(ResidentActivityService residentActivityService) {
        this.residentActivityService = residentActivityService;
    }

    @PostMapping
    public List<ResidentActivity> getAllResidentActivities() {
        return residentActivityService.getAllResidentActivities();
    }

    @PostMapping("/resident/{residentId}")
    public List<ResidentActivity> getResidentActivitiesByResidentId(@PathVariable int residentId) {
        return residentActivityService.getResidentActivitiesByResidentId(residentId);
    }

    @PostMapping("/activity/{activityId}")
    public List<ResidentActivity> getResidentActivitiesByActivityId(@PathVariable int activityId) {
        return residentActivityService.getResidentActivitiesByActivityId(activityId);
    }

    @PostMapping("/add")
    public void addResidentActivity(@RequestBody ResidentActivity residentActivity) {
        residentActivityService.addResidentActivity(residentActivity);
    }
}