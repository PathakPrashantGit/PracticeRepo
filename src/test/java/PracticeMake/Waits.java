package PracticeMake;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); (It is Global Dynamic Wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']")));// this is apply only for Specific Element only
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	}

}
