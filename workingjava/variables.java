package workingjava;

public class variables {
	
	int result; // instance variable
	static float  pi = 2.13f; // static variable
	static final int numten = 10;

	public static void main(String[] args) {
		int num1 =0; //local variable
		int num2 =0; //local variable
		int localresult=0; //local variable
	//	static int final  ten = 10;
	//	numten = 12;
	
		variables var = new variables();
		System.out.println("Result before calculation " +var.result);
		System.out.println("I can access pi " +pi);

		add(num1,num2);
	}

	public static void add(int num1,int num2)
	{
		variables var = new variables();
		System.out.println("Result before calculation in add " +var.result);
		//System.out.println("You cannot access local variable result" +localresult);
	//	System.out.println("You cannot access local variable result even using instance" +var.localresult);
	}
}
