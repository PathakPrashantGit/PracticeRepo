package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_GetOption {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
		
		String k = "10-Apr-1997";
		
		String [] arr = k.split("-");
		
		selectOption(day,arr[0]);
		selectOption(month,arr[1]);
		selectOption(year,arr[2]);
		
		Thread.sleep(5000);
		driver.close();
	}
	
	public static void selectOption(WebElement ele, String str)
	{
		Select sc = new Select(ele);
	List<WebElement> wb =	sc.getOptions();
	
	for(int i =0; i<wb.size(); i++)
	{
		String exp = wb.get(i).getText();
		
		String act = str;
		if(act.equalsIgnoreCase(exp))
		{
			wb.get(i).click();
		}
	}
	}

}
