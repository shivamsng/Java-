package SuperKeyword;

public class Customer {
	void message()
	{
		System.out.println("Hello");
	}
}

class Employee extends Customer
{
	void message()
	{
		System.out.println("My name is Shivam");
	}

	void display()
	{
		
		message();
		super.message();
	}
}

class Test
{
	public static void main(String args[])
	{
		Employee employee = new Employee();
		employee.display();
	}
}
