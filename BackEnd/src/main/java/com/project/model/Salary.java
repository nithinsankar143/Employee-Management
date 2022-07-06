package com.project.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="salary")
public class Salary {
	
@Id
@Column(name="salary_id")
private int id;

@Column(name="salary")
private double salary;

@Column(name="annualsalary")
private  double annualsalary;

@Column (name="bonus")
private double bonus;

@Column(name="from_date")
private Date from_date;

@Column(name="to_date")
private Date to_date;

@OneToMany(mappedBy="salary")
private Set<Employee>employee;


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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public double getAnnualsalary() {
	return annualsalary;
}

public void setAnnualsalary(double annualsalary) {
	this.annualsalary = annualsalary;
}

public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

public Date getFrom_date() {
	return from_date;
}

public void setFrom_date(Date from_date) {
	this.from_date = from_date;
}

public Date getTo_date() {
	return to_date;
}

public void setTo_date(Date to_date) {
	this.to_date = to_date;
}

public Salary(int id, double salary) {
	super();
	this.id = id;
	this.salary = salary;
}






}
