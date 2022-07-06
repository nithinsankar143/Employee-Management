package com.project.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.project.model.City;
import com.project.model.Department;
import com.project.model.Designation;
import com.project.model.Employee;
import com.project.model.Project;
import com.project.model.Salary;


public class HiernateUtil {
	private static SessionFactory sessionFactory;
	private static SessionFactory annotationSessionFactory;
	
	 public static SessionFactory buildSessionAnnotationFactory() {
		 Configuration configuration= new Configuration();
			configuration.configure("hibernate-annotation.cfg.xml");
			configuration.addAnnotatedClass(City.class);
			configuration.addAnnotatedClass(Department.class);
			configuration.addAnnotatedClass(Designation.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Salary.class);
			configuration.addAnnotatedClass(Project.class);
			
			System.out.println("Hibernate configuration loaded Successfully");
			
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory= configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		 
			
	 }
	 public static SessionFactory getSessionannotationFactory() {
		 if(annotationSessionFactory==null)annotationSessionFactory=buildSessionAnnotationFactory();
		 return annotationSessionFactory;
	 }

}
