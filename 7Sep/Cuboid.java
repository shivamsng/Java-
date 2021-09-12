package com.shapehierarchy;

class Cuboid extends ThreeDimensionalShape{
	
	float length;
	float width;
	float height;
	Cuboid(float length,float width,float height){
		super(length,width,height);
	}
	
	void getArea() {
		
		this.length=getDimensionOne();
		this.width=getDimensionTwo();
		this.height=getDimensionThree();
		float areaofcuboid=(2*((length*width)+(width*height)+(length*height)));
		System.out.println("Area of cuboid : "+areaofcuboid);
	}
	
	void getVolume() {
		float cuboidVolume=(getDimensionOne()*getDimensionTwo()*getDimensionThree());
		
		System.out.println("Volume of cuboid : "+cuboidVolume);
	}
}