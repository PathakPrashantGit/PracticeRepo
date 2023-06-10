package PracticeMake;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrashPractice
{

	String [] selectedCourses = {"Java","Python"};
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@Test
	public void selectOptions()
	{
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List<WebElement> cources = driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//li//a//label"));
		
		List<String> listedcourses  = Arrays.asList(selectedCourses);
		for(int i =0; i<cources.size(); i++)
		{
			String courseText = cources.get(i).getText();
			
			if(listedcourses.contains(courseText))
			{
				cources.get(i).click();
			}
		}
	}
}










// return type hot key ctrl+1+Enter