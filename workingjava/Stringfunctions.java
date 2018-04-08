package workingjava;

public class Stringfunctions {

	public static void main(String[] args) {
		String name = "Sachin Tendulkar";
		System.out.println("Name is " +name);
		// Length of String
		int lenght = name.length();
		System.out.println("Length is " +name.length());
		// Substring Sachin
		String substringSachin = name.substring(0, 6);
		System.out.println("Substring : Sachin: is " +substringSachin);
		
		// Substring Sachin
		String substringTendulkar = name.substring(7, 16);
		System.out.println("Substring : Tendulkar is " +substringTendulkar);
		
		//charAt
		
		char charOfS = name.charAt(0);
		System.out.println("charAT : S is " +charOfS);
		
		// Array
		
		String crickersName[] = {"Virat","Rahul","Rohit","Jadeja"};
		// Length of array
		int length = crickersName.length;
		System.out.println("Array : Length is " +length);
		
		//third element in the array
		String thirdElement = crickersName[3];
		System.out.println("Array : third element " +thirdElement);
		
		
		System.out.println("Array : Elements of array " +crickersName);

		// looping 
		
		for (int index=0;index <crickersName.length; index++)
		{
			System.out.println("Array : Elements of array are " +crickersName[index]);
		}
		
		// replace rahul with new player
		
		crickersName[1] = "Dhoni";
		
		// looping 
		
				for (int index=0;index <crickersName.length; index++)
				{
					System.out.println("Array : Elements of array are : After changing " +crickersName[index]);
				}

	}

	 
}
