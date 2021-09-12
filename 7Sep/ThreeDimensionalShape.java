package com.shapehierarchy;

public abstract class ThreeDimensionalShape extends Shape {

	ThreeDimensionalShape(float dimensionOne) {
		super(dimensionOne);
	}
	ThreeDimensionalShape(float length,float width,float height) {
		super(length,width,height);
	}
	abstract void getArea();
	abstract void getVolume();
	
}
