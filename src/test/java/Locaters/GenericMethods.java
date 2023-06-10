package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethods {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		
		WebElement day   = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year  = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		String dob = "15-Dec-2009"; // ["10","apr","1997"]
		
		String [] Dob1 = dob.split("-"); // split method String class
		
		// By using Generic Method
		
		selectdrop(day, Dob1[0]);
		selectdrop(month,Dob1[1]);
		selectdrop(year,Dob1[2]);
		
		
		
		
	}
	
	public static void selectdrop(WebElement element, String text)
	{
		Select s = new Select(element);
		
		s.selectByVisibleText(text);
		
	}

}
