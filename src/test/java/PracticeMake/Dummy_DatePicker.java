package PracticeMake;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy_DatePicker {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dob")).click();
		
		WebElement month =driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select sc = new Select(month);
		
		sc.selectByVisibleText("Apr");
		
		WebElement yr = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select sc1 = new Select(yr);
		sc1.selectByVisibleText("1997");
		
		String date ="10";
		
		List<WebElement> datepick = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
	
	for(WebElement ele :datepick)
	{
		String exp =ele.getText();
		if(exp.equalsIgnoreCase(date))
		{
			ele.click();
			break;
		}
	}
	
	
	
	}

}
