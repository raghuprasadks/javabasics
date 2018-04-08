package exceptionmanagement;

public class accountexception {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 0;
		try {
			int division = num1 / num2;
			String name = "raghu";
			name = null;
			// Arithmetic exception divisio by zero
			System.out.println("accountexception : division " + division);
			System.out.println("accountexception : name " + name);
		} catch (Exception oException) {
			System.out.println("accountexception : Exception occured " + oException);
		}
		
		System.out.println("accountexception: After exception handling");
	}

}
