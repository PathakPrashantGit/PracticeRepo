package Apache_Poi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogFourJ {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		System.out.println("Script execution statrted");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Open");
		
		driver.manage().window().maximize();
		System.out.println("Maximization");
		
		driver.get("http://omayo.blogspot.com/");
		System.out.println("Open URL");
		
		driver.findElement(By.linkText("compendiumdev")).click();
		System.out.println("Clicked on Link");
		
		driver.navigate().back();
		System.out.println("Get Back");
		
		driver.navigate().forward();
		System.out.println("Get Forword");
		
		driver.navigate().refresh();
		System.out.println("Get refresh");
		
		driver.close();
		System.out.println("Get closed the Tab");
	}
}
