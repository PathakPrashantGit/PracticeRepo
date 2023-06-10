package Locaters;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ALERTPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.id("prompt")).click();
	
	Alert ar = driver.switchTo().alert();
	
	Thread.sleep(5000);
	
	ar.sendKeys("Tom");
	
	Thread.sleep(5000);
	
	ar.accept();
	
	
	
	

}
}
