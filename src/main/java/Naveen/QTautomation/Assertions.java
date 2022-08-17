package Naveen.QTautomation;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertions {
	
	@Test
	
	public void HardAssertion1()

	{
	   Assert.assertEquals(true, true);
	   System.out.println("Its not matching");
	   Assert.assertEquals(true, true);
	   System.out.println("Its matching");
		
	}
	
	
	@Test
	public void SoftAssertion1()
	{
		Assert.assertEquals(true, true);
		System.out.println("conditions failed");
		Assert.assertEquals(true, true);
		System.out.println("conditions pass");
		
	}

}
