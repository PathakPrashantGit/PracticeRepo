package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker_1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"checkin\"]")).click();
	while(true) {	
	String actmonth =	driver.findElement(By.xpath("(//div[@class=\"datepicker-days\"])[1]//table//thead//tr[1]//th[@class=\"switch\"]")).getText();
	
	String expmonth = "March 2023";
	
	if(actmonth.equalsIgnoreCase(expmonth))
	{
		driver.findElement(By.xpath("((//div[@class=\"datepicker-days\"])[1]//table//tbody//td[text()='8'])[1]")).click();
		break;
	}
	else
	{
		driver.findElement(By.xpath("(//div[@class=\"datepicker-days\"])[1]//table//thead//tr[1]//th[@class='next']")).click();
	}
	}
	
	
	
	
	
	
	
	
	}

}
