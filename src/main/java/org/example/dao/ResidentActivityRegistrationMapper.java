package org.example.dao;


import org.apache.ibatis.annotations.Mapper;
import org.example.model.ResidentActivityRegistration;

import java.util.List;

@Mapper
public interface ResidentActivityRegistrationMapper {
    void registerResidentForActivity(ResidentActivityRegistration registration);

    List<ResidentActivityRegistration> getRegistrationsForActivity(String activityId);

    List<ResidentActivityRegistration> getAllRegistrations();
}