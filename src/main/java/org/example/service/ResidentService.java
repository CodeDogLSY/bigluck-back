package org.example.service;

import org.example.dao.ResidentMapper;
import org.example.model.Resident;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentService {
    private final ResidentMapper residentMapper;

    public ResidentService(ResidentMapper residentMapper) {
        this.residentMapper = residentMapper;
    }

    public List<Resident> getAllResidents() {
        return residentMapper.getAllResidents();
    }
}