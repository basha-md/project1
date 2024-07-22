package Package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddressPage5 
{
   WebDriver driver;
   @FindBy(name="submissionURL")
   WebElement selectaddressbutton;
   
   @FindBy(xpath="(//input[@type='submit'])[2]")
   WebElement usethisaddressbutton;
   
   public void selectaddress()
   {
	   selectaddressbutton.click();
   }
   public void usethisaddress()
   {
	   usethisaddressbutton.click();
   }
   
   
   public Amazon_AddressPage5(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
