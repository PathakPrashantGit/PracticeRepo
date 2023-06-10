package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Without_SelectClass_By_Generic_Method {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();  
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		
		String xpath_days ="//select[@id='day']//option";
		String xpath_month ="//select[@id='month']//option";
		String xpath_year ="//select[@id='year']//option";
		
		selectdropdown(xpath_days,"10");   
		selectdropdown(xpath_month,"jun");
		selectdropdown(xpath_year,"1990");
		
	}
	public static void selectdropdown(String xpath,String option)
	{
		List<WebElement> dropvalue = driver.findElements(By.xpath(xpath));
		
		for(int i=0; i<dropvalue.size();i++)
		{
			String values =dropvalue.get(i).getText();
			if(values.equalsIgnoreCase(option)) {
				dropvalue.get(i).click();
			}
		}
	}
}