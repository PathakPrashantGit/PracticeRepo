package Pract;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Wait {//cannot define class as static
	static WebDriver driver;
	
	public static void fluent(WebElement element) {
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver);
		
		w.withTimeout(Duration.ofSeconds(40));
		w.pollingEvery(Duration.ofSeconds(5));
		
		w.ignoring(Exception.class);
		w.until(ExpectedConditions.visibilityOf(element));
	}

}
