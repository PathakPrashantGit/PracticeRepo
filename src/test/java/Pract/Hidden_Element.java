package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Element {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		
		//driver.findElement(By.id("displayed-text")).sendKeys("Pathak");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('displayed-text').value='Pathak';");
		
		
	}

}
