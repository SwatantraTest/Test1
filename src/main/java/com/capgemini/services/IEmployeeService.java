package com.capgemini.services;

import com.capgemini.entities.Employee;

public interface IEmployeeService {

	
	public boolean createEmployee(Employee employee) ;
	
	public boolean updateEmployee(Employee employee);
	
	public Employee findById(int id);
}