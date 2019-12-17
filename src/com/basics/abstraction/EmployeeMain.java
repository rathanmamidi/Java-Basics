package com.basics.abstraction;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee org = new FinanceEmployee();

        System.out.println(org.fetchName());
        System.out.println(org.fetchId());
        System.out.println(org.fetchDepartment());
        System.out.println(org.fetchBankName());
        System.out.println(org.fetchSalary());
        System.out.println(org.fetchIFSCCODE());


    }
}
