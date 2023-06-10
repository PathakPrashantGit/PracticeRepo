package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATH_2 {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		//(//input[@type='radio'])[2]
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
//		//input[@type='radio' and @value ='Radio1' ]
		
		driver.findElement(By.xpath("//input[@type='radio' and @value ='Radio1' ]")).click();
	}

}
