package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customerApple")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	
	private int customerId;
	private String firstname, lastname,enable;
	private int customerPhone;
	
	//second table
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "shipping")
		private ShippingAddress shipping;
		
	//Third 	
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "billingAddress")
		private BillingAddress billingAddress;
	
	//Fourth	
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "user")
		private User user;
		
	//Fifth
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "cart")
		private Cart cart;
		
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

}