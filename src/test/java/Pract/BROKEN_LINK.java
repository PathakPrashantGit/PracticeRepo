package Pract;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BROKEN_LINK {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://tutorialsninja.com/demo/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link :links)
		{
			String url = link.getAttribute("href");
			System.out.println(url);
			System.out.println("============================================================");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is Empty. ");
				continue;
			}
			
			
			try {
				HttpURLConnection huc =(HttpURLConnection)(new URL(url).openConnection());
				
				if(huc.getResponseCode()>=400)
				{
					System.out.println(huc+ " Url is Broken");
				}
				else
				{
					System.out.println(huc+ " URL is Valid");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
