package PracticeMake;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> st = driver.getWindowHandles();
		 Iterator<String> it = st.iterator();
		 
		 while(it.hasNext())
		 {
			String tx = it.next();
			
			driver.switchTo().window(tx);
			String exp = "Practice Page";
			
			String act = driver.getTitle();
			if(exp.equalsIgnoreCase(act))
			{
				driver.findElement(By.xpath("//input[@value='Radio2']")).click();
			}
		 }
		 driver.close();
	}

}
