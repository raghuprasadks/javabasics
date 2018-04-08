package exceptionmanagement;

public class accountexceptionfinally2 {

	public static void main(String[] args) {
		
		int num1 =100;
		int num2 = 0;
		try {
			int division = num1/num2;
			System.out.println("division " +division);
		} catch(Exception oException)
		{
			System.out.println("Exception occured " +oException);
		} finally {
			System.out.println("I am finally:Executed all the time ");
		}

		System.out.println("Statement after try/catch");
	}

}
