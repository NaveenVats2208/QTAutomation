package Naveen.QTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFilling {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Form");
		d.findElement(By.id("firstname")).sendKeys("Naveen");
		d.findElement(By.id("lastname")).sendKeys("Kumar");
		d.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[3]")).click();
		d.findElement(By.xpath("//input[@value='dance']")).click();
		d.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]")).click();
		d.findElement(By.id("datepicker")).click();
		d.findElement(By.className("ui-datepicker-year")).click();
	    d.findElement(By.id("datepicker")).sendKeys("22/08/1990");
	    d.findElement(By.id("phonenumber")).sendKeys("7867678987");
	    d.findElement(By.id("username")).sendKeys("Nav123");
	    d.findElement(By.id("email")).sendKeys("eheh@gamil.com");
	    d.findElement(By.id("comment")).sendKeys("I am good person");
	    d.findElement(By.id("pwd")).sendKeys("gjdj544");
	    WebElement E=d.findElement(By.id("pwd"));
	    String S1=E.getAttribute("value");
	    System.out.println(S1);
	    d.findElement(By.className("btn btn-default ")).click();
	  
		
		

	}

}
