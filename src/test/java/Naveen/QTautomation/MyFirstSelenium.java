package Naveen.QTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSelenium {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		d.findElement(By.id("p1")).getText();
		String text=d.findElement(By.id("p1")).getText();
		System.out.println(text);
		d.findElement(By.id("input1")).sendKeys("Naveen");
		d.findElement(By.id("input2")).sendKeys("Kumar");
		WebElement un=d.findElement(By.id("input1"));
		WebElement pw=d.findElement(By.id("input2"));
		String username=un.getAttribute("value");
		System.out.println(username);
		String password=pw.getAttribute("value");
		System.out.println(password);
		un.clear();
		pw.clear();
		un.sendKeys("Java");
		pw.sendKeys("Selenium");
		String username1=un.getAttribute("value");
		System.out.println(username1);
		String password1=pw.getAttribute("value");
		System.out.println(password1);
		
		
		
		
		
		
		
		
	}

}
