package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outerframe);
		
		WebElement wb =driver.findElement(By.xpath("//div[@class=\"iframe-container\"]//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(wb);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hello");
	
	
	
	}
}
