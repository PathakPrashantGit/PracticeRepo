package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_Hold {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.cssSelector("li[class='active']"));
		act.clickAndHold(wb).perform();
		
		act.release().perform();
		
	}

}
