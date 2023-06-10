package Apache_Poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFiles {

	public static void main (String [] args) throws IOException
	{
		//File propfile = new File("config//EmloyeeDetails.properties");
		
		
		File propfile = new File("C:\\Users\\Administrator\\Documents\\Pathak Eclips\\Practice\\config\\EmloyeeDetails.properties");
		
		FileInputStream fis = new FileInputStream(propfile);
		
		
		Properties prop = new Properties();
		prop.load(fis);//it will Load the Employee Details properties file
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Place"));
		System.out.println(prop.getProperty("Designation"));
		System.out.println(prop.getProperty("Experience"));
	
		String nm =prop.getProperty("Name");
	
	
	
	
	
	
	
	
	
	
	}
}
