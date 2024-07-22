package Project1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_shoe5 
{

	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;


	
	
	public void searchfield() 
	{
		searchbox.sendKeys("shoe");
	}
	
	public void searchfield1() 
	{
		searchbox.sendKeys(Keys.ENTER);
	}
	

	public Search_shoe5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
