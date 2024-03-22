package org.example.service;

import org.example.dao.ScheduleMapper;
import org.example.model.Schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleMapper scheduleMapper;

    public ScheduleService(ScheduleMapper scheduleMapper) {
        this.scheduleMapper = scheduleMapper;
    }

    public List<Schedule> getAllSchedules() {
        return scheduleMapper.getAllSchedules();
    }
}