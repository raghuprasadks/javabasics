package workingjava;
public class Maths {
	public static void main(String[] args) {		
		float num1;
		float num2;
		num1 = 100;
		num2 = 20;
		addition(num1,num2);
		subtraction(num1,num2);
		float result;
		 result = multiplication(num1,num2);
		 System.out.println("Multiplication : " +result);
	}	
	public static void addition(float num1,float num2)
	{
		float result;
		result = num1 + num2;
		System.out.println("Addition : " +result);
	}
	
	public static void subtraction(float num1,float num2)
	{
		float result;
		result = num1 - num2;
		System.out.println("Subtraction : " +result);
	}
	
	public static float multiplication(float num1,float num2)
	{
		float result;
		result = num1 * num2;
		return result;
	}

}
