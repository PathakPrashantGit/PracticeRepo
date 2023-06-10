package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassSelect {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// without select class by using List of WebElement
		
		List<WebElement> wb =driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option"));
		
		for(int i =0; i<wb.size(); i++) // size = 4
		{
			String actual =wb.get(i).getText(); // i =0 select i =1 option1 i =2 option2
			
			String expected ="option2";
			if(expected.equalsIgnoreCase(actual))
			{
				wb.get(i).click(); // i =2
			}
		}
	}

}
