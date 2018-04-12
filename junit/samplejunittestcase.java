package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class samplejunittestcase {

	@Test
	public void sum() {
		int num1 = 10;
		int num2 = 15;
		int sum = num1 +num2;
		assertEquals (25,sum);
	}	
	@Test
	public void isEqual ()
	{
		assertEquals("Selenium","Selenium");
	}
	@Test
	public void isTrue ()
	{
		assertTrue(false);
	}
}
