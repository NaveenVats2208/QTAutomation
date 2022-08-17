package Naveen.QTautomation;

	

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	
	 public void multiplication()
	{
		System.out.println("Multiplication is done");

	}
	@Test
	public void Division()
	{
		System.out.println("Division is perofrmed");
	}
	
@BeforeMethod
public void run()
 {
	System.out.println("running");
 }

@AfterMethod

public void walk()
{
	System.out.println("Walking");
}
@BeforeMethod
 public void sleep()
 {
	System.out.println("Sleeping");
 }
@AfterClass
public void jump()
{
	System.out.println("Jumping");
}
}
