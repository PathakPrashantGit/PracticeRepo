package PracticeMake;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		String text = driver.findElement(By.xpath("//a[text()='Facebook']")).getText();
		//Assert.assertTrue(false,text); // Hard Assertion
		                                 // if fail it will not execute rest of Code
		
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(false,text); // this is soft Assertion
		                           // if fail it will Execute rest of code it is just the verification
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(40));
		wait.pollingEvery(Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.manage().deleteAllCookies();
		
	}

}
