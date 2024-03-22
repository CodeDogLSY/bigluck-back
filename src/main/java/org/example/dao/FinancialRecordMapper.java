package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.FinancialRecord;

import java.util.List;

@Mapper
public interface FinancialRecordMapper {
    List<FinancialRecord> getAllFinancialRecords();

    void addFinancialRecord(FinancialRecord financialRecord);
}