package com.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Fetch1 {
	public static void main(String[] args) {  
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
	      
	    TypedQuery query=session.createQuery("from Customer e");  
	    List<Customer> list=query.getResultList(); 
	      
	    Iterator<SalesOrder> itr=list.iterator();  
	    while(itr.hasNext()){  
	    	SalesOrder emp1 =itr.next();  
	     System.out.println(emp1.getSalesorderId());    
	     
	     ShippingAddress shipping = emp1.getShippingAddress();  
	     System.out.println(shipping.getAddress()+" "+shipping.getState()+" "+shipping.getCity()+" "+shipping.getZipcode()+" "+shipping.getCountry());
	    
	     BillingAddress billing = emp1.getBillingAddress();
	     System.out.println(billing.getAddress()+" "+billing.getCity()+" "+billing.getCity()+" "+billing.getCountry()+" "+billing.getZipcode());
	     
	     Cart cart = emp1.getCart();
	     System.out.println(cart.getTotalPrice());
	    }
	    session.close(); 
	    System.out.println("success from salesorder");  
	}  
	} 