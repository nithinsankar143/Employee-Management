package com.project.model;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PROJECT")

public class Project {

@Id
@Column(name="project_id")	
private int project_id;

@Column(name="type")
private String type;

@Column(name="name")
private String name;

@Column(name="budget")
private double budget;

@ManyToMany(mappedBy="projects")
private List<Employee>employee;


public int getProject_id() {
	return project_id;
}

public void setProject_id(int project_id) {
	this.project_id = project_id;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBudget() {
	return budget;
}

public void setBudget(double budget) {
	this.budget = budget;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}




}
