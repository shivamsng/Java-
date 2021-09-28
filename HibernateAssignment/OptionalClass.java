package com.assessment;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		
		String names[] = new String[5];
		Optional<String> optional = Optional.ofNullable(names[4]);
		
		if(optional.isPresent()) {
			
			System.out.print(names[0].length( ));
		}
		
		else {
			
			System.out.println("Item is not present");
			
		}
	}

}