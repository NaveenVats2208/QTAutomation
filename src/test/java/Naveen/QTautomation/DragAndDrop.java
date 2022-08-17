package Naveen.QTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Actions");
		WebElement dragabble=d.findElement(By.id("draggable"));
	WebElement droppable=d.findElement(By.id("droppable"));
	Actions action =new Actions(d);
    action.dragAndDrop(dragabble, droppable).build().perform();
    System.out.println("Drag nd Drop performed");
	
	}

}
