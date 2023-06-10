package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To {
	
	public static void main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement blog = driver.findElement(By.xpath("//li[@class='has-sub']"));
		
		act.moveToElement(blog);
		act.perform();
		
		WebElement sb = driver.findElement(By.linkText("SeleniumByArun"));
		act.moveToElement(sb).perform();
		act.click().perform();
	
		
		
		
		
		
		
		
		
	}

}
