package org.example;

class ExampleClass
{
    final static String companyName = "ThoughtWorks";
}

class Employee
{
     static String companyDeptName = "Finance";

     void setCompanyDeptName(String in)
     {
         companyDeptName = in;
     }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Company Name : "+ ExampleClass.companyName);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e2.setCompanyDeptName("ChangeFinance");
        System.out.println("Employee Department : "+ e1.companyDeptName);

    }
}