package PracticeMake;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_DropDownByNaveen_allmethod {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
	
	
	Select sc = new Select (day);
	sc.selectByVisibleText("10");
  boolean f =sc.isMultiple();  //
  
  System.out.println(f);

  List<WebElement> listdays =sc.getOptions();
  System.out.println(listdays.size());
  
  int Totaldays = listdays.size()-1;
  System.out.println(Totaldays);
  
  
  for(int i =0; i<listdays.size(); i++)
  {
	  String alldays =listdays.get(i).getText();
	  System.out.println(alldays);
	  
	  if(alldays.equals("15"))
	  {
		  listdays.get(i).click();
		  break;
	  }
  }
  
  System.out.println("=============================================="); 
  
	Select sc1 = new Select(month);
	sc1.selectByVisibleText("Apr");
	
	List<WebElement> listmonth= sc1.getOptions();
	
	for(int i=0;i<listmonth.size(); i++)
	{
		String allmonth = listmonth.get(i).getText();
		System.out.println(allmonth);
		if(allmonth.equals("Oct"))
		{
			listmonth.get(i).click();
		}
	}
	
	
	
	
	Select sc2 = new Select(year);
	sc2.selectByVisibleText("1997");
	
	
	
	
	
	
}
	
}
