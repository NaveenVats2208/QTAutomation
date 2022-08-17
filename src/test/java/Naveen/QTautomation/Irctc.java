package Naveen.QTautomation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.core.exec.JoinSwarmCmdExec;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		d.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("HYB");
        d.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
		d.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("PUNE");
		
		d.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
		d.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		d.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])[4]")).click();
		d.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[2]/span")).click();
	    d.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[2]")).click();
    d.findElement(By.xpath("//p-dropdown[@id='journeyClass']//ul//li/span")).click();
	    Thread.sleep(4000);
	    d.findElement(By.xpath("(//li[@role='option'])[12]")).click();
		d.findElement(By.xpath("//label[@for=\"concessionBooking\"]")).click();
		d.findElement(By.xpath("//span[@class=\"ui-button-text ui-clickable\"]")).click();
	    d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	   WebElement Elements= d.findElement(By.xpath("(//div[@class='hidden-xs']//span)[1]")); 
	  List<WebElement> E1= d.findElements(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[1]/div[1])"));
	  System.out.println("No of trains are:" +E1.size());
	    System.out.println(d.getTitle());
	    Thread.sleep(4000);
	   File file=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file, new File("Users\\kumarnaveen\\Desktop"));
     
	}
}
