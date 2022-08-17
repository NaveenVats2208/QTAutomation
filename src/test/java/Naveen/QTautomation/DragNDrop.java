package Naveen.QTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("http://www.uitestpractice.com/Students/Actions");
		WebElement element=d.findElement(By.name("dblClick"));
		Actions action=new Actions(d);
		Thread.sleep(4000);
		action.doubleClick().build().perform();
		System.out.println("doubleclicked");
		
		
	}

}
