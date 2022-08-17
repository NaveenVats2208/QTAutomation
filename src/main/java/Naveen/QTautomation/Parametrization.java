package Naveen.QTautomation;

import org.testng.annotations.Test;

public class Parametrization {
	
	@Test(priority = 3)
	
	void result()
	{
		System.out.println("Result out");
	}

	@Test(priority = 2)
	void orientation()
	{
		System.out.println("orientation method");
	}
	@Test
	void Implementation()
	{
		System.out.println("implementation method");
	}
	@Test(priority = 0)
	void ImplementationD()
	{
		System.out.println("D method");
}
}
