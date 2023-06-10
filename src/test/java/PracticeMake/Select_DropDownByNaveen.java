package PracticeMake;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_DropDownByNaveen {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
	
	
//	Select sc = new Select (day);
//	sc.selectByVisibleText("10");
//  boolean f =sc.isMultiple();  //
  
//	Select sc1 = new Select(month);
//	sc1.selectByVisibleText("Apr");
//	Select sc2 = new Select(year);
//	sc2.selectByVisibleText("1997");
	
	
	
	selectdropdown(day,"10");
	selectdropdown(month,"Apr");
	selectdropdown(year,"1997");
	
	
	
	
}
//lets you have 100 of drop down at that time you have to create 100 select class
	// so create the generic method or Utility method

public static void selectdropdown(WebElement ele, String value)
{
	Select sc = new Select(ele);
	sc.selectByVisibleText(value);
}
}
