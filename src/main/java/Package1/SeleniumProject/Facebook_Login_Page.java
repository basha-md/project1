package Package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page 
{
	
	//step-1: locate each element by using @FindBy
	
	@FindBy(id= "email")
	WebElement username;
	
	@FindBy(name= "pass")
	WebElement password;
	
	@FindBy(xpath= "//button[@name='login']")
	WebElement loginbutton;
	
	@FindBy(xpath ="//a[@class='_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']")
	WebElement accountbutton;
	
	//step-2: creating separate methods for each component
	
	public void un()
	{
		username.sendKeys("basha@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("mypassword");
	}
	public void login()
	{
		loginbutton.click();
	}
	public void createaccount()
	{
		accountbutton.click();
	}
	
	//step-3: initialize each element using pagefactory class inside the constructor
	
	public Facebook_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
