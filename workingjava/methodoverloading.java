package workingjava;
/*
 * Method overloading example. Two methods can have
 * same name but different parameters and return type
 */
public class methodoverloading {
	
	public int addition(int n1,int n2)
	{
		int sum = n1+n2;
		System.out.println("Addition of two integers : " +sum);
		return sum;
	}
	
	public float addition(float n1,float n2)
	{
		float sum = n1+n2;
		System.out.println("Addition of two floats : " +sum);
		return sum;
	}

}
