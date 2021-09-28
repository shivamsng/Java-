package com.assessment;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeNumber {
	public static boolean primenumber(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n != 0 || n != 1) {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			int n = (int)Math.floor(Math.random()*(max-min+1)+min);
			list.add(n);
			System.out.println(n);

		}
		System.out.println("List of Prime Numbers : ");
		list.forEach(num -> {
			boolean isprime = primenumber(num);
			
			if (isprime) {
				
				System.out.print(num + " ");
				
			}
		});

	}

	
}