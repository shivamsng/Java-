package com.shapehierarchy;

public abstract class Shape {
	float dimensionOne;
	float dimensionTwo;
	float dimensionThree;
	
	//Getter and setter method
	public float getDimensionOne() {
		return dimensionOne;
	}

	public void setDimensionOne(float dimensionOne) {
		this.dimensionOne = dimensionOne;
	}

	public float getDimensionTwo() {
		return dimensionTwo;
	}

	public void setdimensionTwo(float dimensionTwo) {
		this.dimensionTwo = dimensionTwo;
	}

	public float getDimensionThree() {
		return dimensionThree;
	}

	public void setDimensionThree(float dimensionThree) {
		this.dimensionThree =dimensionThree;
	}

	
	// Single argument
	Shape(float side1){
		this.dimensionOne=side1;
	}
	
	//two arguments
	Shape(float side1,float side2) {
		this.dimensionOne=side1;
		this.dimensionTwo=side2;
	}
	
	//three arguments 
	Shape(float side1,float side2,float side3) {
		this.dimensionOne=side1;
		this.dimensionTwo=side2;
		this.dimensionThree=side3;
	}
	
}