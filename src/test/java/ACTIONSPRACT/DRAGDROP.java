package ACTIONSPRACT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DRAGDROP {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(frame);
		
		WebElement source =driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']//h5[text()='High Tatras']"));
		WebElement dest = driver.findElement(By.id("trash"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, dest).perform();
		
		
		
		
		
	}

}
