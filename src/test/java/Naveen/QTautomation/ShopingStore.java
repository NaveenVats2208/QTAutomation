package Naveen.QTautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopingStore {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pepperfry.com/");
		System.out.println(d.getTitle());
        d.findElement(By.xpath("//*[@id=\"menu_wrapper\"]/ul/li[1]/a")).click();
       WebElement element= d.findElement(By.linkText("Seating"));
        Actions action=new Actions(d);
        action.moveToElement(element).build().perform();
        Thread.sleep(4000);
     d.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[2]/a")).click();
     d.findElement(By.linkText("Benches")).click();
   List<WebElement> E1=d.findElements(By.xpath("//li[@class='clip-main-cat carousel-cell ']"));
   System.out.println("bench count is " +E1.size());
 WebElement t=d.findElement(By.xpath("(//*[@id=\"page-wrapper-content\"]//ul/li/a)[6]"));
System.out.println(t.getText());

List<WebElement> E2=d.findElements(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div[2]/div[2]/div/ul/li[6]"));
 System.out.println("Industrial bench count is" + E2.size());
 WebElement D=d.findElement(By.className("clip-main-cat carousel-cell "));
   if(D.equals("1 option"))
   {
	   System.out.println("count is more than 1");
   }
   else
   {
	   System.out.println("count is less");
   }
   d.close();
   		
}

}
