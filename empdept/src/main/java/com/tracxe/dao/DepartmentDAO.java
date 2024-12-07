package com.tracxe.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracxe.model.Department;
@Service
public class DepartmentDAO {
	@Autowired
	private DepartmentRepository deptRepo;
	  public List<Department> getAllDepartments() {
		 return deptRepo.findAll();
	}
	  public Department getDepartmentByName(String name) { 
			return deptRepo.findByName(name);
		}
	  public Department getDepartmentByLocation(String location) { 
			return deptRepo.findByLocation(location);
		}
	  public String deleteDepartmentById(int id) {
		  deptRepo.deleteById(id);
		  return "Department is department id "+id+" is deleted.";
	  }
	  public Department registerDepartment(Department dept) {
		  return deptRepo.save(dept);
	  }
	  public Department updateDepartment(Department dept) {
		  return deptRepo.save(dept);
	  }
	  public Department replaceDepartment(Department dept) {
		  return deptRepo.save(dept);
	  }
}