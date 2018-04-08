package workingjava;
public class SimpleInterest {
	public static void main(String args[])
	{
		float interest;
		float principal;
		float time;
		float rate;		
		principal = 10000;
		time = 1;
		rate = 6.5f;		
		interest = (principal*rate*time)/100;		
		System.out.println("Interest is " +interest);		
	}
}
