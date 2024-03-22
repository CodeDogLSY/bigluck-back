package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Schedule;

import java.util.List;

@Mapper
public interface ScheduleMapper {
    List<Schedule> getAllSchedules();
}