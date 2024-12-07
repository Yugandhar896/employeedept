package com.tracxe.empdept;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracxe.dao.EmployeeDAO;
import com.tracxe.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDAO empDAO;
	
	@RequestMapping("show-emps")
	public List<Employee> getAllEmployees() {
		return empDAO.getAllEmployees();
	}
	@RequestMapping("getEmployeeByEmail/{VARCHAR}")
	public Employee getEmployeeByEmail(@PathVariable("VARCHAR")String email) {
		return empDAO.getEmployeeByEmail(email);
		
	}
	@RequestMapping("getEmployeeByCountry/{VARCHAR}")
	public Employee getEmployeeByCountry(@PathVariable("VARCHAR")String country) {
		return empDAO.getEmployeeByCountry(country);	
	}
	@RequestMapping("getEmployeeByGender/{VARCHAR}")
	public Employee getEmployeeByGender(@PathVariable("VARCHAR")String gender) {
		return empDAO.getEmployeeByGender(gender);	
	}
	@RequestMapping("getEmployeeByName/{VARCHAR}")
	public Employee getEmployeeByName(@PathVariable("VARCHAR")String name) {
		return empDAO.getEmployeeByName(name);	
	}
	@RequestMapping("getEmployeeBySalary/{DOUBLE}")
	public Employee getEmployeeBySalary(@PathVariable("DOUBLE")double salary) {
		return empDAO.getEmployeeBySalary(salary);	
	}
	@RequestMapping("getEmployeeByDoj/{DATE}")
	public Employee getEmployeeByDoj(@PathVariable("DATE")LocalDate doj) {
		return empDAO.getEmployeeByDoj(doj);	
	}
	@DeleteMapping("deleteEmployeeById/{ID}")
	public String deleteEmployeeById(@PathVariable("ID")int id) {
		return empDAO.deleteEmployeeById(id);	
	}
	@PostMapping("registerEmp")
	public Employee registerEmployee(@RequestBody Employee employee) {
		return empDAO.registerEmployee(employee);	
	}
	@PutMapping("updateEmp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return empDAO.registerEmployee(employee);	
	}
	@PostMapping("registerEmps")
	public List<Employee> registerEmployees(@RequestBody List<Employee> employee) {
		return empDAO.registerEmployees(employee);	
	}
	
	
}
 