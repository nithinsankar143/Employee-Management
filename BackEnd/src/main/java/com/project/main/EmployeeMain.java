package com.project.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.project.model.City;
import com.project.model.Department;
import com.project.model.Designation;
import com.project.model.Employee;
import com.project.model.Project;
import com.project.model.Salary;
import com.project.util.HiernateUtil;

public class EmployeeMain {
public static void main(String[] args) {
	Session session=HiernateUtil.getSessionannotationFactory().getCurrentSession();
	session.beginTransaction();
	   Date date=new Date(System.currentTimeMillis());

	Employee emp=new Employee(1,"nithin","sankar","male",23,"single","abc@gmail.com",9274238890L,date);
	
	//city
	City city=new City();
	city.setCity_id(1);
	city.setName("Tiruppur");
	city.setState("Tamilnadu");
	city.setPincode(638111);
	
	city.setCity_id(2);
	city.setName("Coimbatore");
	city.setState("Tamilnadu");
	city.setPincode(641005);
	
	city.setCity_id(3);
	city.setName("Bangalore Urban");
	city.setState("Karnataka");
	city.setPincode(560001);
	
	city.setCity_id(4);
	city.setName("Palakkad");
	city.setState("Kerala");
	city.setPincode(678001);
	
	city.setCity_id(5);
	city.setName("Chennai");
	city.setState("Tamilnadu");
	city.setPincode(600005);
	
	emp.setCity(city);
	
	
	//Department
	Department department=new Department(1,"Development");
	
	Department department1=new Department(2,"Production");
	
	Department department2=new Department(3,"Operator");
	
    emp.setDepartment(department);
   

    
    
    //Designation
   Designation designation=new Designation();
    designation.setDesignation_id(1);
    designation.setName("Full Stack Developer");
    designation.setMin_salary(30000);
    designation.setMax_salary(50000);
    
    designation.setDesignation_id(2);
    designation.setName("Support Engineer");
    designation.setMin_salary(20000);
    designation.setMax_salary(40000);
    
    designation.setDesignation_id(3);
    designation.setName("Program Analyst");
    designation.setMin_salary(25000);
    designation.setMax_salary(50000);
    
    emp.setDesignation(designation);
    
    //Project
    Project project=new Project();
    project.setProject_id(1);
    project.setType("Backend Development");
    project.setName("Movie DB");
    project.setBudget(1000000);
    
    project.setProject_id(2);
    project.setType("Frondend Development");
    project.setName("Netflix-Clone ");
    project.setBudget(1500000);
    
    project.setProject_id(3);
    project.setType("Support Engineer");
    project.setName("Android Task Tracker");
    project.setBudget(1000000);
    
    //Salary
    Salary salary=new Salary(1,20000);
    emp.setSalary(salary);
    
    Set <Employee> employees=new HashSet<Employee>();
	city.setEmployees(employees);
	department.setEmployee(employees);
	designation.setEmployee(employees);
	salary.setEmployee(employees);
	
	
	
	session.persist(city);
	session.persist(department);
	
	session.persist(designation);
	session.persist(emp);
	session.persist(salary);
	
	session.getTransaction().commit();
	HiernateUtil.getSessionannotationFactory().getCurrentSession().close();
}
}