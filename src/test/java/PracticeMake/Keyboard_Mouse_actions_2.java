package PracticeMake;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Mouse_actions_2 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement fm =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(fm);
		Actions act = new Actions(driver);
		
		List<WebElement> drag =driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
		WebElement drop = driver.findElement(By.id("trash"));
		for(int i =0; i<drag.size(); i++)
		{
			WebElement pic =drag.get(i);
			
			act.dragAndDrop(pic, drop);
			act.build().perform();
			
		}
		
		
		
		
		
	}

}
