package Exception;

import java.util.Scanner;

public class ArrayIndex {

		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the number of elements in the arrays");
			int number = scanner.nextInt();
			
			int[] arr = new int[number];
			
			System.out.println("Enter the elements in the array: ");
			
			try {
				for (int i = 0; i < number; i++)
					arr[i] = scanner.nextInt();
			
				System.out.println("Enter the index of the array element you want to access");

				int index = scanner.nextInt();
				System.out.println("The array element at index " + index + " = " + arr[index]);
				System.out.println("The array element successfully accessed");
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			} 
			catch (Exception e) {
				System.out.println("Invalid selection");
			}

			scanner.close();

		}

	}
	