package com.project.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
@Id
@Column(name="employee_id")
private int employee_id;

@Column(name="first_name")
private String first_name;

@Column(name="last_name")
private String last_name;

@Column(name="gender")
private String gender;

@Column(name="age")
private int age;

@Column(name="marital_status")
private String marital_status;

@Column(name="email")
private String email;

@Column(name="phone_num")
private long phone_num;


@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="city")
private City city;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="department")
private Department department;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="designation")
private Designation designation;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="salary")
private Salary salary;

@Column(name="joining_date")
private Date joining_date;




@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(
		name="employee_project",
		joinColumns=@JoinColumn(name="employee_id"),
		inverseJoinColumns=@JoinColumn(name="project_id")
		)
private List<Project> projects;


public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMarital_status() {
	return marital_status;
}
public void setMarital_status(String marital_status) {
	this.marital_status = marital_status;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone_num() {
	return phone_num;
}
public void setPhone_num(long phone_num) {
	this.phone_num = phone_num;
}

public City getCity() {
	return city;
}
public void setCity(City city) {
	this.city = city;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Designation getDesignation() {
	return designation;
}
public void setDesignation(Designation designation) {
	this.designation = designation;
}
public Salary getSalary() {
	return salary;
}
public void setSalary(Salary salary) {
	this.salary = salary;
}
public Date getJoining_date() {
	return joining_date;
}
public void setJoining_date(Date joining_date) {
	this.joining_date = joining_date;
}
public Employee() {
	
}
public Employee(int employee_id, String first_name, String last_name, String gender, int age, String marital_status,
		String email, long phone_num,Date joining_date) {
	super();
	this.employee_id = employee_id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.gender = gender;
	this.age = age;
	this.marital_status = marital_status;
	this.email = email;
	this.phone_num = phone_num;
	this.joining_date=joining_date;
	
}


}
