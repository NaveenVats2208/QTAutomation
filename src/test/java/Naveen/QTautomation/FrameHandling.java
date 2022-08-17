package Naveen.QTautomation;

import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/students/switchto");
	d.switchTo().frame("iframe_a");
		d.findElement(By.id("name")).sendKeys("Naveen Kumar");
		d.switchTo().defaultContent();
		d.findElement(By.id("alert")).click();
		Alert alert=d.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();
//		JavascriptExecutor js=(JavascriptExecutor)d;
//		js.executeScript("window.scrollBy(0,1000); ");
	} 

}