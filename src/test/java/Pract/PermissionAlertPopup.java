package Pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionAlertPopup {

	public static void main(String[] args) {
		
//		FirefoxOptions opt = new FirefoxOptions(); // for firefox
//		opt.addArguments("--disable notification");
//		
		
		ChromeOptions options = new ChromeOptions(); // for chrome 
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
