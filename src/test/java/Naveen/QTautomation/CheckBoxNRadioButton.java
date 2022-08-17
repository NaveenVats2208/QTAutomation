package Naveen.QTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxNRadioButton {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		//d.findElement(By.id("red")).click();
		//d.findElement(By.id("green")).click();
		WebElement red=d.findElement(By.id("red"));
		Thread.sleep(4000);
		WebElement green =d.findElement(By.id("green"));
		red.click();
		Thread.sleep(2000);
		
		green.click();
		
		d.findElement(By.id("baseball")).click();
		d.findElement(By.id("tennis")).click();
		d.findElement(By.id("football")).click();
		d.findElement(By.id("cricket")).click();
		
		
		
	}

}
