package com.shapehierarchy;

public class Triangle extends TwoDimensionalShape {
	float areaoftriangle;
	Triangle(float base,float height) {
		super(base,height);		
	}
	
	// area of triangle
	void getArea() {
		areaoftriangle=(((float)0.5)*(getDimensionOne()*getDimensionTwo()));
		
		System.out.println("Area of triangle : "+areaoftriangle);
	}
}