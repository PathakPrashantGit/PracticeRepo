package PracticeMake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Release_Hold {
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement wb =driver.findElement(By.id("autocomplete"));
		Actions act = new Actions(driver);
		
		
		act.clickAndHold(wb);
		Thread.sleep(5000);
		act.release(wb);
		Thread.sleep(5000);
		act.sendKeys("pathak");
		
		
		WebElement mouce = driver.findElement(By.id("mousehover"));
		act.moveToElement(mouce);
		
		act.build().perform();
		
	}

}
