package ACTIONSPRACT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RIghtClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		
		Actions act = new Actions(driver);
		
//		WebElement wb =driver.findElement(By.xpath("//span[text()='right click me']"));
//		act.contextClick(wb).perform();
		
		WebElement wb =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(wb).perform();
		
		
		Alert at =driver.switchTo().alert();
		Thread.sleep(5000);
		at.accept();
		
		
	}

}
