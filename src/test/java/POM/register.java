package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class register {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		Log_in lg = new Log_in(driver);
		lg.click_Register();
		
		Register_page rs = new Register_page();
		
		
		
		
		
	}

}
