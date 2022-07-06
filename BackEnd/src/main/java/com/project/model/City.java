package com.project.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CITY")

public class City {
	
@Id
@Column(name="city_id")
private int city_id;

@Column(name="name")
private String name;

@Column (name="state")
private String state;

@Column (name="pincode")
private int pincode;

@OneToMany(mappedBy="city")
private Set<Employee>employees;



public Set<Employee> getEmployees() {
	return employees;
}

public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}

public int getCity_id() {
	return city_id;
}

public void setCity_id(int city_id) {
	this.city_id = city_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}




}