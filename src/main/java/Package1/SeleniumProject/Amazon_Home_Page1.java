package Package1.SeleniumProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page1 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	

	public void searchbox()
	{
		search_tf.sendKeys("shoe" + Keys.ENTER);
	}
	
	

	
	public Amazon_Home_Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	
}
