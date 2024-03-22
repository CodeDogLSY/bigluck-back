package org.example.controller;

import org.example.model.DietaryPreferences;
import org.example.service.DietaryPreferencesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 食材偏好
 */
@RestController
@RequestMapping("/dietaryPreferences")
public class DietaryPreferencesController {
    private final DietaryPreferencesService dietaryPreferencesService;

    public DietaryPreferencesController(DietaryPreferencesService dietaryPreferencesService) {
        this.dietaryPreferencesService = dietaryPreferencesService;
    }

    /**
     * 某个居民食材偏好
     * @param residentId
     * @return
     */
    @PostMapping("/resident/{residentId}")
    public List<DietaryPreferences> getDietaryPreferencesByResidentId(@PathVariable int residentId) {
        return dietaryPreferencesService.getDietaryPreferencesByResidentId(residentId);
    }

    /**
     * 增加食材偏好
     * @param dietaryPreferences
     */
    @PostMapping("/add")
    public void addDietaryPreferences(@RequestBody DietaryPreferences dietaryPreferences) {
        dietaryPreferencesService.addDietaryPreferences(dietaryPreferences);
    }
}