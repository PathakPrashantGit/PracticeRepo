package TablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
	List<WebElement> age = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[2]"));
	List<WebElement> name = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[1]"));
	int max =0;
	
for(int i=0; i<age.size(); i++)
{
	String Valueage = age.get(i).getText();
	
	int value = Integer.parseInt(Valueage);
	
	if(value>max)
	{
		max = value;
	}
	
}
System.out.println(max);

String maxvalue = Integer.toString(max);

for(int i =0; i<age.size(); i++)
{
	String str = age.get(i).getText();
	
	if(str.equalsIgnoreCase(maxvalue))
	{
		System.out.println("Name of Person => " +name.get(i).getText()+" Age of Person => "+age.get(i).getText());
	}
}
	
	
		
	}
}
