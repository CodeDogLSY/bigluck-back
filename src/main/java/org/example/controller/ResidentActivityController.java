package org.example.controller;

import org.example.model.ResidentActivity;
import org.example.service.ResidentActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 居民活动报名表
 */
@RestController
@RequestMapping("/residentActivities")
public class ResidentActivityController {
    private final ResidentActivityService residentActivityService;

    public ResidentActivityController(ResidentActivityService residentActivityService) {
        this.residentActivityService = residentActivityService;
    }

    /**
     * 获取所有居民的活动报名列表
     */
    @PostMapping
    public List<ResidentActivity> getAllResidentActivities() {
        return residentActivityService.getAllResidentActivities();
    }

    /**
     *
     * 获取单个居民的活动列表
     */
    @PostMapping("/resident/{residentId}")
    public List<ResidentActivity> getResidentActivitiesByResidentId(@PathVariable int residentId) {
        return residentActivityService.getResidentActivitiesByResidentId(residentId);
    }

    /**
     *
     * 获取单个活动的居民报名列表
     */
    @PostMapping("/activity/{activityId}")
    public List<ResidentActivity> getResidentActivitiesByActivityId(@PathVariable int activityId) {
        return residentActivityService.getResidentActivitiesByActivityId(activityId);
    }

    /**
     * 为某个居民报名某个活动
     */
    @PostMapping("/add")
    public void addResidentActivity(@RequestBody ResidentActivity residentActivity) {
        residentActivityService.addResidentActivity(residentActivity);
    }
}