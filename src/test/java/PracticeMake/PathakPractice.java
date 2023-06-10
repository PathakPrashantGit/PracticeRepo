package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.internal.SystemPropertyUtil;

public class PathakPractice {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		List<WebElement> wb = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]//div//div[@class=\"DayPicker-Day\"]"));

		System.out.println(wb.size());
	for(int i =0; i<wb.size(); i++)
	{
		String tx = wb.get(i).getText();
		System.out.println(tx);
		
		if(tx.equalsIgnoreCase("16"))
		{
			wb.get(i).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
