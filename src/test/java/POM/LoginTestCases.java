package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCases {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		// create object of login class
		
		Log_in lg = new Log_in(driver);
		
		lg.click_email("prashant.pathak@gmail.com");
		lg.click_password("Prashant@97");
		lg.click_submit();
		
	}

}
