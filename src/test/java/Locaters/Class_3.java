package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_3 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		//XPATH by Atrribute
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("velocity");
		
		//XPATH by Text
		
		Thread.sleep(5000);
		String about =driver.findElement(By.xpath("//a[text()='About Us']")).getText(); // getText is method of WebElement
		
		System.out.println(about);
		
		//XPATH by Contains
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@class, 'displayed-class')]")).sendKeys("Pune");
		
		//XPATH by Index
		
		Thread.sleep(5000); // static wait 
		driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();
		
		//Absolute xpath
		
		
		
		
		
		
		
		
		
	}

}





















