package MymainClientClassDemo;

import Addition.AdditionService;
import Division.DivisionService;
import Evenodd.EvenoddService;
import Multiply.MultiplicationService;
import Subtraction.SubtractionService;

public class MainClientClassDemo {
	public static void main(String args[]) {
		//Calling addition by creating object
		AdditionService Addition=new AdditionService();
		int resultAddition = Addition.showAddition(6,4);
		System.out.println("Addition = "+ resultAddition);
		
		//Calling Subtraction by creating object
		SubtractionService Substraction=new SubtractionService();
		int resultSubtraction = Substraction.showSubtraction(6,4);
		System.out.println("Substraction = "+resultSubtraction);
		
		//Calling Multiplication by creating object
		MultiplicationService Multiplication=new MultiplicationService();
		int resultMultiplication = Multiplication.showMultiplication(6,4);
		System.out.println("Multiplication = "+resultMultiplication);
		
		//Calling Division by creating object
		DivisionService Division=new DivisionService();
		int resultDivision = Division.showDivision(6,4);
		System.out.println("Division = "+ resultDivision);
		
		EvenoddService evenOddService = new EvenoddService();
        evenOddService.evenoddshow(56);
			
	}

}
