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

//	Employee emp=new Employee(1,"nithin","sankar","male",23,"single","abc@gmail.com",9274238890L,date);
	
	//city
	City city=new City();
	city.setCity_id(1);
	city.setName("Tiruppur");
	city.setState("Tamilnadu");
	city.setPincode(638111);
	
	City city1=new City();
	city1.setCity_id(2);
	city1.setName("Coimbatore");
	city1.setState("Tamilnadu");
	city1.setPincode(641005);
	
	City city2=new City();
	city2.setCity_id(3);
	city2.setName("Bangalore Urban");
	city2.setState("Karnataka");
	city2.setPincode(560001);
	
	City city3=new City();
	city3.setCity_id(4);
	city3.setName("Palakkad");
	city3.setState("Kerala");
	city3.setPincode(678001);
	
	City city4=new City();
	city4.setCity_id(5);
	city4.setName("Chennai");
	city4.setState("Tamilnadu");
	city4.setPincode(600005);
	
//	emp.setCity(city);
	
	
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