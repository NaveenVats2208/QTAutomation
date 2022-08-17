package Naveen.QTautomation;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGImplementation {
	
	@Test
	
	void multiplication() 
	{
		System.out.println("multiplication performed");
	}
	@Test
	
	void calc()
	{
		System.out.println("Calculator");
	}
  @BeforeMethod()
  void run()
  {
	  System.out.println("I am running");
  }
  @AfterMethod()
   void cooking()
   {
	  System.out.println("I am cooking");
   }
  @BeforeClass()
  void zym()
  {
	  System.out.println("Doing workout");
  }
  @AfterClass()
  void walk()
  {
	  System.out.println("I am walking");
  }
}
