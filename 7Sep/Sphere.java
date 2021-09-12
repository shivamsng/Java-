package com.shapehierarchy;

class Sphere extends ThreeDimensionalShape{
	Sphere(float radius){
		super(radius);
	}
	void getArea() {
		float areaofsphere=(4*((float)Math.PI)*getDimensionOne()*getDimensionOne());
		System.out.println("Area of sphare : "+areaofsphere);
	}
	void getVolume() {
		float sphereVolume=(((float)4.0/(float)3.0)*((float)Math.PI)*getDimensionOne()*getDimensionOne()*getDimensionOne());
		System.out.println("Volume of sphare : "+sphereVolume);
	}
}