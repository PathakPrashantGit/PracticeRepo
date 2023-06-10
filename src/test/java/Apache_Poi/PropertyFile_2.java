package Apache_Poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_2 {
	
	static WebDriver driver ;
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Administrator\\Documents\\Pathak Eclips\\Practice\\config\\ProjectDetails.properties");
	
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String browserName = prop.getProperty("Browser");
		String urlLunch = prop.getProperty("Url");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver () ;
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
	   driver.manage().window().maximize();
	   driver.get(urlLunch);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
