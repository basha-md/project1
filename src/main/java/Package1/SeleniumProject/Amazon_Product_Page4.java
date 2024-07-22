package Package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page4 
{

	WebDriver driver;
	@FindBy(id="wishListMainButton")
	WebElement wishlist;
	
	@FindBy(xpath="(//span[.='View Your List'])[2]")
	WebElement viewyourlistbutton;
	
	@FindBy(partialLinkText="Add to Cart")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//span[@class='a-button a-button-primary g-cart-checkout-btn']")
	WebElement proceedtocheckoutbutton;
	
	public void shoeproduct()
	{
		wishlist.click();
	}
	
	public void viewyourlist()
	{
		viewyourlistbutton.click();
	}
	public void addtocart()
	{
		addtocartbutton.click();
	}	
	public void proceedtocheckout()
	{
		proceedtocheckoutbutton.click();
	}
	
	public Amazon_Product_Page4(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
}
