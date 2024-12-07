package com.tracxe.empdept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracxe.dao.DepartmentDAO;
import com.tracxe.model.Department;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentDAO deptDAO;
	
	@RequestMapping("show-depts")
	public List<Department> getAllDepartments() {
		return deptDAO.getAllDepartments();
	}
	@RequestMapping("getDepartmentByName/{VARCHAR}")
	public Department 	getDepartmentByName(@PathVariable("VARCHAR")String name) {
		return deptDAO.getDepartmentByName(name);
	}
	@RequestMapping("getDepartmentByLocation/{VARCHAR}")
	public Department 	getDepartmentByLocation(@PathVariable("VARCHAR")String location) {
		return deptDAO.getDepartmentByLocation(location);
	}
	@DeleteMapping("deleteDepartmentById/{ID}")
	public String 	deleteDepartmentById(@PathVariable("ID")int id) {
		return deptDAO.deleteDepartmentById(id);
	}
	@PostMapping("registerDept")
	public Department 	registerDepartment(@RequestBody Department department) {
		return deptDAO.registerDepartment(department);
	}
	@PutMapping("updateDept")
	public Department 	updateDepartment(@RequestBody Department department) {
		return deptDAO.updateDepartment(department);
	}
	@PostMapping("updateDepartment")
	public Department 	replaceDepartment(@RequestBody Department department) {
		return deptDAO.replaceDepartment(department);
	}
}
