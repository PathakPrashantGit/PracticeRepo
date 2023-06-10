package ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOBE_BY_OFFSET {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.moveByOffset(100, 100).contextClick().build().perform();
		
		
		
	}

}
