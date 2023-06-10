package Locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_1 {
	
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5)); // this is pageLoad tiomout Wait
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.switchTo().frame("courses-iframe"); switch by Id of Frame
		
		WebElement frame =driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		
		//driver.switchTo().frame(frame); // switch frame by WEbElement
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("(//div[@class='login-btn'])[2]")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		
	}

}
