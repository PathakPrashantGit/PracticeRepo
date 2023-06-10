package PracticeMake;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class REDBUS_DATEPICKER {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onward_cal")).click();
		
		String mnth ="feb";
		String yr ="2023";
		String date ="20";
		
		while(true)
		{
			String my =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String [] arr =my.split(" ");
			
			String a =arr[0]; //month
			String b =arr[1]; // year
			
			if(a.equalsIgnoreCase(mnth) && b.equalsIgnoreCase(yr))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[text()='>']")).click();
			}
		}
		List<WebElement> datepic =driver.findElements(By.xpath("//tbody//tr//td"));
		
		for(WebElement dates :datepic)
		{
			String exp =dates.getText();
			if(exp.equalsIgnoreCase(date))
			{
				dates.click();
				break;
			}
		}
		
	}

}
