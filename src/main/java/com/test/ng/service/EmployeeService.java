package com.test.ng.service;

import com.test.ng.model.Employee;

public interface EmployeeService {

    public Employee findByEmpId(int empId);

    public void createEmployee(Employee employee);

    public void saveEmployee(Employee employee);

    public double generateBasicSalary(Employee employee) throws Exception;

    public double generateGrossSalary(Employee employee, double additions,double deductions) throws Exception;

}
