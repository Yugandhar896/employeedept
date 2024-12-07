package com.tracxe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracxe.model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	@Query("from Department p where p.deptName = :name")
	Department findByName(@Param("name") String name);
	Department findByLocation(@Param("location") String location);
	Department deleteById(@Param("id") int id);
}
