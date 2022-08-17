package Naveen.QTautomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject {


	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.edgedriver().setup();
	WebDriver d=new EdgeDriver();
	d.manage().window().maximize();
	d.get("https://www.amazon.in/");
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile smartphonephones under 30000");
	d.findElement(By.id("nav-search-submit-button")).click();
	d.findElement(By.id("a-autoid-0-announce")).click();
	 Thread.sleep(4000);
	 d.findElement(By.className("a-dropdown-prompt"));
	 d.findElement(By.id("s-result-sort-select_4")).click();
	 WebElement E2=d.findElement(By.xpath("//span[text()='Newest Arrivals']"));
	 System.out.println(E2.getText());
	 String E3=E2.getText();
	 Assert.assertEquals(E3, "Newest Arrivals");
	 System.out.println("matched");
    
    
    
	
	
}
	}

    
	
	
	
	
	
	
	
	