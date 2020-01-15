package com.anish.employeeapi.model;

public class EmployeeNew {

    private int id;
    private String name;
    private float salary;
    private int age;
    private String profile_img;


    public EmployeeNew(String employee_name,float employee_salary, int empooyee_age)
    {
        this.name=employee_name;
        this.salary=employee_salary;
        this.age=empooyee_age;
    }


}
