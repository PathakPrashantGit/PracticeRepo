package Pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
	static WebDriver driver;
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	// implicite Waits
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	WebElement fname =driver.findElement(By.name("email"));
	WebElement lname = driver.findElement(By.name("pass"));
	WebElement log = driver.findElement(By.linkText("Forgotten password?"));
	
//	exwait(fname,10,"Prashant");
//	exwait(lname,5,"pathak");
//	exwait(lname,5,"pathak");
	
	exwait(log,5);
	
	
	
}

public static void exwait(WebElement element,int a)
{
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(a));
	//w.until(ExpectedConditions.visibilityOf(element));
	w.until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	//element.sendKeys(value);
	
}



}
