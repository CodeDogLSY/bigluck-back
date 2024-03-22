package org.example.service;


import org.example.dao.FinancialRecordMapper;
import org.example.model.FinancialRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialRecordService {
    private final FinancialRecordMapper financialRecordMapper;

    public FinancialRecordService(FinancialRecordMapper financialRecordMapper) {
        this.financialRecordMapper = financialRecordMapper;
    }

    public List<FinancialRecord> getAllFinancialRecords() {
        return financialRecordMapper.getAllFinancialRecords();
    }

    public void addFinancialRecord(FinancialRecord financialRecord) {
        financialRecordMapper.addFinancialRecord(financialRecord);
    }
}