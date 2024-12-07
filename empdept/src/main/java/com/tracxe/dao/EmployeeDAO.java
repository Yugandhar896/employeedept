package com.tracxe.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracxe.model.Employee;

@Service
public class EmployeeDAO {
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	public Employee getEmployeeByEmail(String email) { 
		return empRepo.findByEmail(email);
	}
	public Employee getEmployeeByCountry(String country) { 
		return empRepo.findByCountry(country);
	}
	public Employee getEmployeeByGender(String gender) { 
		return empRepo.findByGender(gender);
	}
	public Employee getEmployeeByName(String name) { 
		return empRepo.findByName(name);
	}
	public Employee getEmployeeBySalary(double salary) { 
		return empRepo.findBySalary(salary);
	}
	public Employee getEmployeeByDoj(LocalDate doj) { 
		return empRepo.findByDoj(doj);
	}
	public String deleteEmployeeById(int id) {
		empRepo.deleteById(id);
		return "Employee with employee id  "+id+" is deleted"; 
	}
	public Employee registerEmployee(Employee emp) { 
		return empRepo.save(emp);
	}
	public Employee updateEmployee(Employee emp) { 
		return empRepo.save(emp);
	}
	public List<Employee> registerEmployees(List<Employee> empList) { 
		return empRepo.saveAll(empList);
	}
}
