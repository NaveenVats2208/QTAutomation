package Naveen.QTautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitelyWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.deltadental.com/");
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("For dentist")));
		System.out.println("ExplictWait is implemented");
	}

}
