package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.DietaryPreferences;

import java.util.List;

@Mapper
public interface DietaryPreferencesMapper {
    List<DietaryPreferences> getDietaryPreferencesByResidentId(int residentId);

    void addDietaryPreferences(DietaryPreferences dietaryPreferences);
}
