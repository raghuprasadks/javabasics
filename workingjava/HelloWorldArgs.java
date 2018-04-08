package workingjava;

public class HelloWorldArgs {
	public static void main(String args[])
	{
		System.out.println("You have entered " +args.length + " words");
		for (int i=0;i<args.length;i++)
		{
			System.out.println ("The words you have entered are " +args[i]);
		}}
}
