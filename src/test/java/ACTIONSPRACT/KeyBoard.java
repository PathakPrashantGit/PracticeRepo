package ACTIONSPRACT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard {
	
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userName")).sendKeys("Amit");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.TAB);
		
		act.keyUp(Keys.TAB);
		
		act.sendKeys("amit@gmail.com");
		
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		
		act.sendKeys("Pune");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		
		act.sendKeys("c");
		
		act.keyUp(Keys.CONTROL);
		
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		
		act.keyUp(Keys.CONTROL);
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		
		act.keyDown(Keys.ENTER);
		act.keyUp(Keys.ENTER);
		
		act.build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
