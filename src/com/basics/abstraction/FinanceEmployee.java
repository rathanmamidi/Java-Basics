package com.basics.abstraction;

public class FinanceEmployee extends ORGEmployee {

    public FinanceEmployee() {
        super();
        System.out.println("FinanceEmployee");
    }

    @Override
    public Double fetchSalary() {
        return 2000.23D;
    }

    @Override
    public String fetchBankName() {
        return "HDFC";
    }

    @Override
    public String fetchIFSCCODE() {
        return "BENG123";
    }
}
