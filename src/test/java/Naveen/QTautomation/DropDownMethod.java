package Naveen.QTautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		WebElement Element=d.findElement(By.id("mySelect"));
		Select select =new Select(Element);
		Thread.sleep(4000);
		List<WebElement> E1=select.getOptions();
		for(int i = 0; i<E1.size();i++) {
            String t = E1.get(i).getText();
                    System.out.println(t);
		}	
		
		
	}
	}


