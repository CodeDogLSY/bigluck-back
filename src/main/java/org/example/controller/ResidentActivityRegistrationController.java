package org.example.controller;

import org.example.model.ResidentActivityRegistration;
import org.example.service.ResidentActivityRegistrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/registrations")
public class ResidentActivityRegistrationController {
    private final ResidentActivityRegistrationService registrationService;

    public ResidentActivityRegistrationController(ResidentActivityRegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    /**
     * 居民活动进行报名
     */
    @PostMapping("/activities")
    public void registerResidentForActivity(@RequestBody ResidentActivityRegistration registration) {
        registrationService.registerResidentForActivity(registration);
    }

    /**
     * 获取对应活动报名列表
     */
    @PostMapping("/activities/{activityId}")
    public List<ResidentActivityRegistration> getRegistrationsForActivity(@PathVariable String activityId) {
        return registrationService.getRegistrationsForActivity(activityId);
    }

    /**
     * 居民活动报名列表
     */
    @PostMapping
    public List<ResidentActivityRegistration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }
}