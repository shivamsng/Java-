package com.shapehierarchy;

class Cube extends ThreeDimensionalShape{
	Cube(float side){
		super(side);
	}
	void getArea() {
		float areaofcube=(6*getDimensionOne()*getDimensionTwo());
		System.out.println("Area of cube : "+areaofcube);
	}
	void getVolume() {
		float cubeVolume=(getDimensionOne()*getDimensionOne()*getDimensionOne());
		System.out.println("Volume of cube : "+cubeVolume);
	}
}