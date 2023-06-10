package Locaters;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\New Sele\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();  // create the object of WebDriver interface
		
		driver.get("https://www.facebook.com/");  // for open the Browser (wait until page full load)
		
		//driver.navigate().to("https://www.facebook.com/"); // for open the Browser (dose not wait for page fully load)
		
		//Methods of WebDriver interface 
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String source =driver.getPageSource();
		System.out.println(source);
		
//		Navigation nev =driver.navigate(); // this is for page nevigation
//		Thread.sleep(5000);
//		  
//		nev.back(); // for back
//		
//		Thread.sleep(5000); // java Wait mechanism (Static wait)
//		nev.forward(); // forwrd to page 
//		
//		
//		
//		Thread.sleep(5000);
//		nev.refresh(); // refresh the page (all these methods are of Navigation Interface)
//		
//		driver.manage().window().maximize();  // maximize for window
//		
//		driver.manage().window().minimize(); // minimize the window 
//		
////	driver.close(); // it will close your current tab
////	driver.quit(); // it will close all your tab
//		
//		// set size of browser
//		
//		Dimension d = new Dimension(500,700);
//		
//		driver.manage().window().setSize(d); // its take reference variable of Dimention class
		
		
		//set Position of browser tab
		
//		Point p = new Point(400,300);
//		driver.manage().window().setPosition(p);
		
		
	      WebElement wb = driver.findElement(By.id("email"));  // find one webElement on page
	      
	     // find element returns WebElement interface
	       wb.sendKeys("selenium@practice"); // sendKeys it is method of WebElement interface
	       
	       driver.findElement(By.name("pass")).sendKeys("selenuim@123");
	       //driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
	       
	       //driver.findElement(By.linkText("Forgotten password?")).click();
	       
	       driver.findElement(By.partialLinkText("Forgotten")).click();
	       
	       
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
