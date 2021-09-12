package com.shapehierarchy;

public class ShapeMain {

		public static void main(String args[]) {
			
			//Creating object for Circle
			TwoDimensionalShape twoDimensionalCircle=new Circle((float)8);
			twoDimensionalCircle.getArea();
			
			//Creating object for Square
			TwoDimensionalShape twoDimensionalShapesquare=new Square((float)8);
			twoDimensionalShapesquare.getArea();
			
			//Creating object for Triangle
			TwoDimensionalShape twoDimensionalShapeTriangle = new Triangle((float)9,(float)7);
			twoDimensionalShapeTriangle.getArea();
			
			//Creating object for Sphere Area
			ThreeDimensionalShape threeDimensionalShapesphere=new Sphere((float)8);
			threeDimensionalShapesphere.getArea();
			
			//Creating object for Sphere Volume
			ThreeDimensionalShape threeDimensionalShapesphere1=new Sphere((float)8);
			threeDimensionalShapesphere1.getVolume();
			
			//Creating object for Cube Area
			ThreeDimensionalShape threeDimensionalShapecube=new Cube((float)3);
			threeDimensionalShapecube.getArea();
			
			//Creating object for  Cube volume
			ThreeDimensionalShape threeDimensionalShapecube1=new Cube((float)3);
			threeDimensionalShapecube1.getVolume();
			
			//Creating object for Cube Area
		    ThreeDimensionalShape Cuboid1=new Cuboid((float)3,(float)5,(float)2);
			Cuboid1.getArea();
			
			//Creating object for  Cube volume
		    ThreeDimensionalShape Cuboid2=new Cuboid((float)3,(float)5,(float)2);
			Cuboid2.getVolume();
	   }
		
	}