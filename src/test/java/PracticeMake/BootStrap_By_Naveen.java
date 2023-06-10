package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_By_Naveen {
	static WebDriver driver;
	 public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();  
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		List<WebElement> boots =driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		
		for(int i=0; i<boots.size(); i++)
		{
			String lists = boots.get(i).getText();
			System.out.println(lists);
			
			if(lists.equalsIgnoreCase("Angular")) {
				boots.get(i).click();
				boolean t =boots.get(i).isSelected();
				System.out.println(t);
				
			}
		}
	}

}
