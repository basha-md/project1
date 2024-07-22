package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserRegister1
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement mobilenumber;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verify;
	
	 public void mobile()
	   {
		 mobilenumber.sendKeys("8143504972");
	   }
	   public void customername()
	   {
		   name.sendKeys("basha");
	   }
	   public void pwd()
	   {
		   password.sendKeys("Ashbash@123");
	   }
	   public void continuebutton()
	   {
		   verify.click();
	   }
	   public NewUserRegister1(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }

}
