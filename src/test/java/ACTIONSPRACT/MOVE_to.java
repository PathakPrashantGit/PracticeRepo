package ACTIONSPRACT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOVE_to {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement wb =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();
	}

}
