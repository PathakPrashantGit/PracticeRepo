package PracticeMake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class STALE_Element_HAndle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/success");
		driver.manage().window().maximize();
		WebElement links =driver.findElement(By.xpath("//a[text()='Address Book']"));
		links.click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		links.click();
		
	}

}
