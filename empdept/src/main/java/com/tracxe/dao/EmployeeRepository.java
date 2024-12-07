package com.tracxe.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracxe.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Employee findByEmail(@Param("email") String email);
	Employee findByCountry(@Param("country") String country);
	Employee findByGender(@Param("gender") String gender);
	@Query("from Employee p where p.empName = :name")
	Employee findByName(@Param("name") String name);
	Employee findBySalary(@Param("salary") double salary);
	Employee findByDoj(@Param("doj") LocalDate doj);
}

