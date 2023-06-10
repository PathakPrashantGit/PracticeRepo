package TablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable_2 {
	
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		
		List<WebElement> table =driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		for(int i =0; i<table.size(); i++)
		{
			String text = table.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
	}

}
