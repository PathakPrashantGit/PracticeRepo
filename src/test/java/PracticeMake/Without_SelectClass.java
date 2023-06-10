package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Without_SelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
	List<WebElement> daylist =	driver.findElements(By.xpath("//select[@id='day']//option"));
	
	for(int i =0; i<daylist.size(); i++)
	{
		String alldays = daylist.get(i).getText();
		if(alldays.equals("25"))
		{
			daylist.get(i).click();
		}
	}
	
	List<WebElement> monthlist =	driver.findElements(By.xpath("//select[@id='month']//option"));
	
	for(int i =0; i<monthlist.size(); i++)
	{
		String allmonths = monthlist.get(i).getText();
		if(allmonths.equals("Jun"))
		{
			monthlist.get(i).click();
		}
	}
	
	
	List<WebElement> yearlist =	driver.findElements(By.xpath("//select[@id='year']//option"));

	for(int i =0; i<yearlist.size(); i++)
	{
		String allyears = yearlist.get(i).getText();
		if(allyears.equals("1998"))
		{
			yearlist.get(i).click();
		}
	}
	
	
	}
}
