package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSClass_4 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		//css by tagname
		
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("velocity");
//		
//		//CSS by ID(tagname#atrributeofID only)
//		
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input#autocomplete")).clear();
		
		WebElement wb =driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		
		boolean b =wb.isSelected();
		System.out.println(b);
		
		WebElement wb1 = driver.findElement(By.xpath("//input[@id=\"alertbtn\"]"));
		boolean bb =wb.isEnabled();
		System.out.println(bb);
		
		boolean rr =driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).isDisplayed();
		
		System.out.println(rr);
		
		
		
	}

}
