package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.ResidentActivity;

import java.util.List;

@Mapper
public interface ResidentActivityMapper {
    List<ResidentActivity> getAllResidentActivities();

    List<ResidentActivity> getResidentActivitiesByResidentId(int residentId);

    List<ResidentActivity> getResidentActivitiesByActivityId(int activityId);

    void addResidentActivity(ResidentActivity residentActivity);
}