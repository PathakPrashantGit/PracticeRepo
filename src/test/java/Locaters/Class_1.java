package Locaters;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_1 {
	
	public static void main(String[] args) {
		
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat();
	String time =sdf.format(d);
	System.out.println(time);
	}

}
