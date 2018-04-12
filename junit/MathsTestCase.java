package junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import developer.Maths;

public class MathsTestCase {

	static Maths math = null;
	
	@Test
	public void additionTest() {
		//Maths math = new Maths();
		int acutal = math.addition(10, 15);
		int expected = 25;
		assertEquals(expected,acutal);
	}

	@Test
	public void subtractionTest() {
		//Maths math = new Maths();
		int actual = math.subtraction(10, 15);
		int expected = -5;
		assertEquals(expected,actual);
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		math = new Maths();
	}
}

