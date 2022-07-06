package com.project.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department {

@Id
@Column(name="department_id")
private int id;

@Column(name="name")
private String name;


@OneToMany(mappedBy="department")
private Set<Employee> employee;



public Set<Employee> getEmployee() {
	return employee;
}

public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Department(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}




}
