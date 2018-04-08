package workingjava;

public class dog extends animal{

	public static void main(String[] args) {
		dog dog1 = new dog();
		
		dog1.name = "Super dog";
		dog1.color = "white";
		dog1.weight = 30;
		
		System.out.println("I am dog.. I got properties from my parent :my color is : "+dog1.color);
		dog1.makeSound();
		
	}

	public void makeSound()
	{
		System.out.println("dog : bow...ww .. bowboww..");
	}


}
