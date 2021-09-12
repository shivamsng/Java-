package com.shapehierarchy;

	public abstract class TwoDimensionalShape extends Shape {

		TwoDimensionalShape(float side1){
			super(side1);
		}
	    TwoDimensionalShape(float side1,float side2) {
			super(side1,side2);
		}
		abstract void getArea();
	}
