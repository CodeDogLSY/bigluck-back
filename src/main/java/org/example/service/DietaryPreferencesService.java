package org.example.service;

import org.example.dao.DietaryPreferencesMapper;
import org.example.model.DietaryPreferences;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DietaryPreferencesService {
    private final DietaryPreferencesMapper dietaryPreferencesMapper;

    public DietaryPreferencesService(DietaryPreferencesMapper dietaryPreferencesMapper) {
        this.dietaryPreferencesMapper = dietaryPreferencesMapper;
    }

    public List<DietaryPreferences> getDietaryPreferencesByResidentId(int residentId) {
        return dietaryPreferencesMapper.getDietaryPreferencesByResidentId(residentId);
    }

    public void addDietaryPreferences(DietaryPreferences dietaryPreferences) {
        dietaryPreferencesMapper.addDietaryPreferences(dietaryPreferences);
    }
}