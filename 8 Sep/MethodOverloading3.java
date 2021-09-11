package Eightsep;

class MethodOverloading3 {
	    public void show(char ch, int numb)
	    {
	         System.out.println ("The show method is defined for the first time");
	    }
	    public void show(int numb, char ch)  
	    {
	         System.out.println ("The show method is defined for the second time");
	    }
	}
 
	class Main
	{
	   public static void main(String args[])
	   {
		   MethodOverloading3 p1 = new MethodOverloading3();
	       p1.show('G', 62);
	       p1.show(46, 'S');
	   }
	}

