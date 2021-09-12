package com.shapehierarchy;

public class Square extends TwoDimensionalShape{
	float areaofsquare;
	Square(float side){
		super(side);
	}
	// for calculating the area	
	void getArea() {
		areaofsquare=getDimensionOne()*getDimensionOne();
		System.out.println("Area of Square : "+areaofsquare);
	}

}