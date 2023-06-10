package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in {
	
	// webElement declaration
	
	@FindBy(xpath="//input[@id=\"userEmail\"]") private WebElement email;
	@FindBy(id="userPassword") private WebElement password;
	@FindBy(xpath="//input[@name=\"login\"]") private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot password?']") private WebElement forgetpwd;
	@FindBy(xpath="//a[text()='Register here']") private WebElement register;
	
	// create constructor // WebElement initialization
	
	public Log_in(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilization of webelement location
	
	//create method
	public void click_email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void click_password(String pass)
	{
		password.sendKeys(pass);
	}
	public void click_submit()
	{
		submit.click();
	}
	
	public void Click_Forget()
	{
		forgetpwd.click();
	}
	public void click_Register()
	{
		register.click();
	}

}
