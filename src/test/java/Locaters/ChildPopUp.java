package Locaters;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildPopUp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		
		// getWindowHandle return only String
		// getwindowhandles return Set<String>
	Set<String> windows =	driver.getWindowHandles();
	Iterator<String> it =windows.iterator();
	
	String parentWindow  =it.next();
	String childWindow = it.next();
	
	driver.switchTo().window(childWindow);
	
	driver.findElement(By.xpath("(//div[@class='login-btn'])[2]")).click();
	
	driver.switchTo().window(parentWindow);
		
		
		
	}

}
