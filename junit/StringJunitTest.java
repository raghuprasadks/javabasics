package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringJunitTest {
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class: This is called when a class in instantiated");
	}

	@Before
	public  void beforeMethod()
	{
		System.out.println("Before Method: This is called before a test method is called");
	}
	
	
	@Test
	public void compareCase() {
		String name = "JUNIT";
		String toUpper = name.toUpperCase();
		System.out.println("Test: compareCase");
		assertEquals (name,toUpper);
		
	}	
	
	@Test
	public void checkChar() {
		
		String name = "Junit";
		char firstChar = name.charAt(0);
		System.out.println("Test: checkChar");
		assertEquals ('J',firstChar);
	}
	
	@After
	public void afterMethod()
	{
		System.out.println("After Method: This is called after a test method is called");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class: This is called when a class goes out of scope");
	}

}
