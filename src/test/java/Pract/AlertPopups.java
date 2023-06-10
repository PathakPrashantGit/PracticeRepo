package Pract;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		Alert a =driver.switchTo().alert();
		
		String text =a.getText();
		System.out.println(text);
		a.sendKeys("Welcome");
		
		a.accept();
		
		
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		
	String result =driver.findElement(By.id("result")).getText();
//		
		System.out.println(result);
		
		
		
	}

}
