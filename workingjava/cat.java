package workingjava;

public class cat extends animal{
	
	String specialcatchar;
	
	public static void main(String[] args) {
		cat cat1 = new cat();
		
		cat1.name = "Super cat";
		cat1.color = "Black";
		cat1.weight = 10;
		
		System.out.println("I am cat.. I got properties from my parent :Name is : "+cat1.name);
		cat1.makeSound();
		cat1.eat();
		cat1.mySpecialCharec();
		
	}

	public void makeSound()
	{
		System.out.println("cat : meow...meow..");
	}
	
	public void mySpecialCharec()
	{
		specialcatchar = "Drink milk by closing eyes";
		System.out.println("cat : mySpecialCharec : " +specialcatchar);
	}
}
