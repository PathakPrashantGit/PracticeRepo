package MakeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	 {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
	 }
	
	@Test
	public void bookTicket()
	{
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Patna");
		
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	 driver.findElement(By.xpath("//p[text()='Patna, India']")).click();
	 
	 driver.findElement(By.xpath("//label[@for='toCity']")).click();
	 
	}

}
