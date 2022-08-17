package Naveen.QTautomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void softAssertion()
	{
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(false, true);
		System.out.println("Expression not matching");
		sa.assertEquals(20, 10);
		System.out.println("Expressions matching");
		sa.assertEquals(30, 10);
		System.out.println("passed test");
	}
     
	
}
