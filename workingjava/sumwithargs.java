package workingjava;

public class sumwithargs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
	//	float radius = Float.parseFloat(args[0]);
	//	float area = 3.14f*radius*radius;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int sum = num1+num2+num3;
		System.out.println("Sum of three numbers is  " +sum);
	}
}
