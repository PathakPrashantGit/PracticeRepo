package Locaters;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  // Upcasting 
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// to take screenshot we have to use GetScreenShotAs method of TakesScreenshot interface
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // TypeCasting
		
		File dest = new File("C:\\Users\\Administrator\\Downloads\\SELENIUM\\PDF\\Screenshot\\facebook.pdf");
		
		FileHandler.copy(source, dest);
		
	}

}
