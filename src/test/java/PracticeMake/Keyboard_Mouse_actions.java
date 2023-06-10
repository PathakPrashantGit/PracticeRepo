package PracticeMake;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Mouse_actions {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Prashant");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB);
		act.sendKeys("pathakprashant@gmail.com");
		//act.perform();
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("Pune Wadki Nala");
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
