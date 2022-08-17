package Naveen.QTautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Triago {

	public static void main(String[] args) throws InterruptedException  {
 
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.trivago.in/");
		d.findElement(By.xpath("//label[text()='Hotel']")).click();
		d.findElement(By.cssSelector("input[type='search']")).sendKeys("Mumbai");
		
		
		d.findElement(By.xpath("//button[@data-testid='calendar-checkin']")).click();
		 d.findElement(By.xpath("(//span[text()='17'])[1]")).click();
		 d.findElement(By.xpath("(//span[text()='18'])[1]")).click();
		 d.findElement(By.xpath("//span[text()='2 Guests']")).click();
	        Thread.sleep(2000);
	     d.findElement(By.xpath("//span[text()='Search']")).click();
	     d.findElement(By.xpath("//input[@type='search']")).sendKeys("Mumbai");
	        d.findElement(By.xpath("//button[@type='submit'][1]")).click();
	        Thread.sleep(2000);
	         Select s = new Select(d.findElement(By.id("sorting-selector")));
	         Thread.sleep(2000);
	         WebElement Element=d.findElement(By.id("sorting-selector"));
	      Select select=new Select(Element);
	     select.selectByVisibleText("Rating only");
	       Thread.sleep(2000);
        List<WebElement> Element1=d.findElements(By.xpath("//button[@data-testid='item-name']"));
        for(WebElement options:Element1)
        {
        	System.out.println(options.getText());
        }
        Thread.sleep(2000);
        List<WebElement> Element2=d.findElements(By.xpath("//span[@itemprop='ratingValue']"));
        		for(WebElement options1:Element2)
        		{
        			System.out.println("Rating value of the hotels in descending order " +options1.getText());
        		}
        		Thread.sleep(1000);
        		List<WebElement> Element3=d.findElements(By.xpath("//p[@data-testid='recommended-price']"));
        		for(WebElement options2:Element3)
        		{
        			System.out.println("price "+options2.getText());
        		}

        		List<WebElement> Element4=d.findElements(By.xpath("//div[@class='flex flex-grow-1 justify-between accomodation-item_infoSection__jtzM6 flex-1']"));
        		for(int i=0;i<Element4.size();i++)
        		{
        			String P=Element4.get(i).getText();
        			System.out.println("rent" +P);
        		}
        		for(WebElement options3:Element4)
        		{
        			System.out.println("Details rent and rating wise" +options3.getText());
        		}
}
}
