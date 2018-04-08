package workingjava;

public class MathsArgs {
	public static void main(String[] args) {		
		float num1;
		float num2;
		num1 = new Float(args[0]).floatValue();
		num2 = new Float(args[1]).floatValue();
	//	addition(num1,num2);
		MathsArgs mathsArgs = new MathsArgs();
		mathsArgs.addition(num1, num2);
		subtraction(num1,num2);
		float result;
		 result = multiplication(num1,num2);
		 System.out.println("Multiplication : " +result);		 
		 System.out.println("Division "+division(num1,num2));		 
	}	
	public void addition(float num1,float num2)
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

	public static float division(float num1,float num2)
	{
		float result;
		result = num1 / num2;
		return result;
	}
	
	
}
