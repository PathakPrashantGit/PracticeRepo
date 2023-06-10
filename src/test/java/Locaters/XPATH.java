package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATH {
	
	public static void main (String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		////input[@name='email']
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prashant");
		
//		//*[@placeholder='Email address or phone number']
		
		driver.findElement(By.xpath("//*[@placeholder='Email address or phone number']")).sendKeys("Prashant");
		
//		//a[text()='Forgotten password?']
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
//		//a[contains(@id,'u_0_0')]
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
//		(//input)[3]
	}

}
