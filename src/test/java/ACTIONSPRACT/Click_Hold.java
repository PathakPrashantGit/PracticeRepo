package ACTIONSPRACT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_Hold {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(search);
		act.release(search);
		
		act.keyDown(Keys.SHIFT).sendKeys("hello");
		
		act.build().perform();
		
	}

}
