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
@Table(name = "cartitemApple")

public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	private int cartitemId;
	private int quantity,price;
	
	//Mapping 
	
	//second table
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product")
	private Product product;
	
	
	
	public int getCartitemId() {
		return cartitemId;
	}
	public void setCartitemId(int cartitemId) {
		this.cartitemId = cartitemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	

}