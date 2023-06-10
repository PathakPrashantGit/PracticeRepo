package ROBOT_Class;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOUSE_MOVE {

	public static void main(String[] args) throws AWTException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/success");
		driver.manage().window().maximize();
		
		Robot rb = new Robot();
		rb.mouseMove(150, 250);
	}
}
