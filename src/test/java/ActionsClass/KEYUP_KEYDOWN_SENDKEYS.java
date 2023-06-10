package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KEYUP_KEYDOWN_SENDKEYS {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.id("userName")).sendKeys("Prashant Pathak");
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("pathak@gmail.com");
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("Nagpur");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.sendKeys("c");
		
		act.keyUp(Keys.CONTROL);
		
		act.sendKeys(Keys.TAB);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		
		act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	}

}
