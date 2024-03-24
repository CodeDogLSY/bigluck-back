package org.example.controller;

import org.example.model.MedicalRecord;
import org.example.model.ResidentActivity;
import org.example.service.MedicalRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 医疗记录
 */
@RestController
@RequestMapping("/medical-records")
public class MedicalRecordController {
    private final MedicalRecordService medicalRecordService;

    public MedicalRecordController(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }

    @PostMapping
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordService.getAllMedicalRecords();
    }

    /**
     *
     * 获取单个居民的活动列表
     */
    @PostMapping("/resident/{residentId}")
    public List<MedicalRecord> getMedicalRecordsByResident(@PathVariable int residentId) {
        return medicalRecordService.getMedicalRecordsByResident(residentId);
    }

}