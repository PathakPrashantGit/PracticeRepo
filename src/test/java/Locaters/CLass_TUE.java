package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLass_TUE {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement selectdropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		// Select is class when tagname is Select
		Select s = new Select(selectdropdown); // 
		
		//s.selectByIndex(1);
		//s.selectByValue("option3");
		s.selectByVisibleText("Option2");
		
		
	}

}
