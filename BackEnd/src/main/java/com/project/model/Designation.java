package com.project.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DESIGNATION")
public class Designation {
	
@Id
@Column(name="designation_id")
private int designation_id;

@Column(name="name")
private String name;

@Column(name="min_salary")
private double min_salary;

@Column(name="max_salary")
private double  max_salary;

@OneToMany(mappedBy="designation")
private Set<Employee> employee;



public Set<Employee> getEmployee() {
	return employee;
}

public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
}

public int getDesignation_id() {
	return designation_id;
}

public double getMin_salary() {
	return min_salary;
}

public void setMin_salary(double min_salary) {
	this.min_salary = min_salary;
}

public double getMax_salary() {
	return max_salary;
}

public void setMax_salary(double max_salary) {
	this.max_salary = max_salary;
}

public void setDesignation_id(int designation_id) {
	this.designation_id = designation_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}






}
