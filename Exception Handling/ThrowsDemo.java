package Exception;

public class ThrowsDemo {
	static void validate(int age) throws ArithmeticException {

		if (age < 18) {
			throw new ArithmeticException(" not valid");
		}

	}

	public static void main(String ar[]) {

		try {
			validate(12);  //caller
		} catch (Exception e) {

			System.out.println("  handled  here");
		}
	}
}
