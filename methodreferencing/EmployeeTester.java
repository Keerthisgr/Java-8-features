package com.xworkz.features.methodreferencing;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee emp = () -> {
            return "Sales";

        };
        System.out.println(emp.getNameOfDepartment());
//        Employee emp1 =   EmployeeTester::nameOfDepartment;
//        System.out.println(emp1.getNameOfDepartment());

        Employee emp1 =   DummyClass::nameOfDepartment;
        System.out.println(emp1.getNameOfDepartment());
    }

}
