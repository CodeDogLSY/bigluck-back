package org.example.service;

import org.example.dao.MedicalRecordMapper;
import org.example.model.MedicalRecord;
import org.example.model.ResidentActivity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {
    private final MedicalRecordMapper medicalRecordMapper;

    public MedicalRecordService(MedicalRecordMapper medicalRecordMapper) {
        this.medicalRecordMapper = medicalRecordMapper;
    }

    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordMapper.getAllMedicalRecords();
    }

    public List<MedicalRecord> getMedicalRecordsByResident(int residentId) {
        return medicalRecordMapper.getMedicalRecordsByResident(residentId);
    }
}