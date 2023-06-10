package ROBOT_Class;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/success");
		driver.manage().window().maximize();
		
		Robot rb = new Robot();
		
		Rectangle rt  = new  Rectangle(10,10,250,450);
		BufferedImage  bimage =rb.createScreenCapture(rt);
		File screenshotFile = new File(System.getProperty("user.dir")+"\\File\\capturedScreenshot.png");
		
		Thread.sleep(5000);
		
		ImageIO.write(bimage, "png", screenshotFile);
		
		
	}

}
