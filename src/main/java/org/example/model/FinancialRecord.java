package org.example.model;

import java.math.BigDecimal;

public class FinancialRecord {
    private int id;
    private String transactionDate;
    private String transactionType;
    private float amount;
    private String description;

    public FinancialRecord(int id, String transactionDate, String transactionType, float amount, String description) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
