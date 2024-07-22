package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidCredentials3 
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin;

	public void un()
	{
	  username.sendKeys("+919618746120");
	}
	public void cont()
	{
		continue_.click();
	}
	public void pwd()
	{
		password.sendKeys("mohd@1989");
	}
	public void sign()
	{
		signin.click();
	}
	public InvalidCredentials3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
