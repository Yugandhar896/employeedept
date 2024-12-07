package com.tracxe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY) 
	private int deptId;
	private String deptName;
	private String location;
	
	public Department() {
		
	}
	
	public Department(int deptId, String deptName, String location) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getLocation() {
		return location;
	}
	
	
	
	
}
