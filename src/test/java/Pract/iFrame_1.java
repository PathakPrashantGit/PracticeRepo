package Pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame_1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summery.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		WebElement fr =driver.findElement(By.xpath("//iframe[@name=\"packageListFrame\"]"));
		driver.switchTo().frame(fr);
		driver.findElement(By.xpath("//li//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		
		WebElement fr1 =driver.findElement(By.xpath("//iframe[@name=\"packageFrame\"]"));
		driver.switchTo().frame(fr1);
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();// go back to main page
		
		
		
		WebElement fr2 =driver.findElement(By.xpath("//iframe[@class=\"rightIframe\"]"));
		driver.switchTo().frame(fr2);
		String text =driver.findElement(By.xpath("//h2[text()='Interface WebDriver']")).getText();
		System.out.println(text);
	}

}
