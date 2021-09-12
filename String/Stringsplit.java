package com.String;

public class Stringsplit {
	public static void main(String args[])
    {
        String string = "Shivam,Singh";
        String[] arrayOfString= string.split("," );
  
        for (String array :arrayOfString )
        	
            System.out.println(array);
    }
}
