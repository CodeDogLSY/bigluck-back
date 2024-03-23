package org.example.controller;

import org.example.model.FinancialRecord;
import org.example.service.FinancialRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 财务记录
 */
@RestController
@RequestMapping("/financialRecords")
public class FinancialRecordController {
    private final FinancialRecordService financialRecordService;

    public FinancialRecordController(FinancialRecordService financialRecordService) {
        this.financialRecordService = financialRecordService;
    }

    @PostMapping
    public List<FinancialRecord> getAllFinancialRecords() {
        return financialRecordService.getAllFinancialRecords();
    }

    @PostMapping("/add")
    public void addFinancialRecord(@RequestBody FinancialRecord financialRecord) {
        financialRecordService.addFinancialRecord(financialRecord);
    }
}