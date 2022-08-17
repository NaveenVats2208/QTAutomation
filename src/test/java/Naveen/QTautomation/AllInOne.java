package Naveen.QTautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllInOne {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Widgets");
		d.findElement(By.id("image_file")).sendKeys("C:\\Users\\kumarnaveen\\Desktop\\Sample.jpg");
		d.findElement(By.xpath("//input[@value=\"Upload\"]")).click();	
	//	
//		WebElement draggable=d.findElement(By.id("draggable"));
//		WebElement droppable=d.findElement(By.id("droppable"));
//		Actions action=new Actions(d);
//		action.dragAndDrop(draggable, droppable).build().perform();

	//	d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		
//		d.findElement(By.id("input1")).sendKeys("Naveen");
//		d.findElement(By.id("input2")).sendKeys("Kumar");
//		WebElement E1=d.findElement(By.id("input1"));
//		WebElement E2=d.findElement(By.id("input2"));
//		String username=E1.getAttribute("value");
//		System.out.println(username);
//		E1.clear();
//		E1.sendKeys("SeleniumK");
//		WebElement A1=d.findElement(By.id("red"));
//		WebElement A2=d.findElement(By.id("cricket"));
//		A1.click();
//		A2.click();
//		WebElement element=d.findElement(By.id("mySelect"));
//		Select select=new Select(element); //make object
//		select.selectByValue("orange");
//		List<WebElement>L1=select.getOptions();
//		
//		{
//		for(int i=0;i<=L1.size();i++)
//		{
//			String t=L1.get(i).getText();
//			System.out.println(t);
//		}
//			
//		
//		}
		
	}
}


