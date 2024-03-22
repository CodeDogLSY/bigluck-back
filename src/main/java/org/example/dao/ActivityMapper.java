package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Activity;

import java.util.List;

@Mapper
public interface ActivityMapper {
    List<Activity> getAllActivities();
}