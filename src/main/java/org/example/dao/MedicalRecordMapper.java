package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.MedicalRecord;

import java.util.List;

@Mapper
public interface MedicalRecordMapper {
    List<MedicalRecord> getAllMedicalRecords();
}