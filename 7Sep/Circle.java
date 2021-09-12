package com.shapehierarchy;

public class Circle extends TwoDimensionalShape {
    float areaofcircle;
	Circle(float radius){
		super(radius);
	}
	
	//Circle
	
	void getArea()	{
		areaofcircle=getDimensionOne()*getDimensionOne()*(float)Math.PI;
		
		System.out.println("area of circle : "+areaofcircle);
	}
}
