package TablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Max_StaticTable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> ele =driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));
		int max =0;
		for(int i =0; i<ele.size(); i++)
		{
			String n = ele.get(i).getText();
			
			int h = Integer.parseInt(n);
			
			if(h>max)
			{
				max=h;
			}
		}
		//System.out.println(max);
		
		List<WebElement> tb = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		
		for(int i=0; i<tb.size(); i++)
		{
			String rowdata = tb.get(i).getText();
			List<WebElement> b =driver.findElements(By.xpath("//table[@id='table1']//tbody//tr["+i+1+"]//td[2]"));
			
			for(int j=0; j<b.size(); j++)
			{
				String k =b.get(j).getText();
				int a = Integer.parseInt(k);
				System.out.println(a);
				if(a==max)
				{
					System.out.println(rowdata);
				}
			}
		}
		
		
	}

}
