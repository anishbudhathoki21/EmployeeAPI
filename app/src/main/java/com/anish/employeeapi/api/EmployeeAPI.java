package com.anish.employeeapi.api;

import com.anish.employeeapi.model.Employee;
import com.anish.employeeapi.model.EmployeeNew;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeAPI {

    @GET("employees")

    Call<List<Employee>> getEmployee();

    @POST("create")
    Call<Void> registerEmployee(@Body EmployeeNew emp);


    @GET("employee/{empID}")

    Call<Employee> getEmployeeByID(@Path("empID") int empID);
}
