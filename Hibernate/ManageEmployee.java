package com.hibernate;

 

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

 

public class ManageEmployee {

 

    static SessionFactory sessionFactoryObj;
    static Session sessionObj;

 

    private static SessionFactory buildSessionFactory() {
// Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");
// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
                .applySettings(configObj.getProperties()).build();
// Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactoryObj;
    }

 

    public static void main(String[] args) {

 

        try {
            sessionObj = buildSessionFactory().openSession();
            sessionObj.beginTransaction();

 

        } catch (Exception me) {
            System.err.println("Failed to create sessionFactory object." + me);
        }
        ManageEmployee ME = new ManageEmployee();

 

        /* Add few employee records in database */
        Integer empID1 = ME.addEmployee("Ashish", "kumar", 55000);// asssinged values from here
        Integer empID2 = ME.addEmployee("Akshit", "kumar", 50000);// asssinged values from here

 

    }

 

    /* Method to CREATE an employee in the database business logic */
    public Integer addEmployee(String fname, String lname, int salary) {
        sessionObj = sessionFactoryObj.openSession();
        Transaction tx = null;
        Integer employeeID = null;
        try {
            tx = sessionObj.beginTransaction();
            Employee employee = new Employee(fname, lname, salary);// created the object of employee class
            employeeID = (Integer) sessionObj.save(employee); // save the object or insert the recording
            tx.commit();// explictiy call the commit esure that auto commite should be false
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            sessionObj.close();
        }
        return employeeID;
    }
}