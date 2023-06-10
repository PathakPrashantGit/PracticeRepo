package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_2 {
	static WebDriver driver;

	public static void main(String[] args) { 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();  
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class=\"dropdown-menu show\"]//a"));
		System.out.println(lists.size());
		for(int i=0; i<lists.size(); i++)
		{
			String exp = lists.get(i).getText();
			if(exp.equalsIgnoreCase("action"))
			{
				String text =lists.get(i).getText();
				System.out.println(text);
				lists.get(i).click();
				
			}
		}

}
	}
