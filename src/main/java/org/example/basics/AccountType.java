package org.example.basics;

public enum AccountType {
    Current("CU"),
    Savings("SA"),
    Deposit("DP");

    private String code;
    private AccountType(String code){
        this.code=code;
    }
    public String getCode() {
        return code;
    }
}
