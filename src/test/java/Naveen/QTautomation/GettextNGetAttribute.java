package Naveen.QTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettextNGetAttribute {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        String Text =    d.findElement(By.id("p3")).getText();
        System.out.println(Text);
        WebElement username = d.findElement(By.id("input1"));
        WebElement password = d.findElement(By.id("input2"));

        d.findElement(By.id("input1")).sendKeys("JAVA");
        d.findElement(By.id("input2")).sendKeys("SELENIUM");

        String Uname1=username.getAttribute("value");
        System.out.println(Uname1);
        String Pwd1=password.getAttribute("value");
        System.out.println(Pwd1);

        username.clear();
        password.clear();

        username.sendKeys("Naveen");
        String Uname2=username.getAttribute("value");
        System.out.println(Uname2);

        password.sendKeys("Kumar");
        String Pwd2=password.getAttribute("value");
        System.out.println(Pwd2);

    }

}
        
        
        


