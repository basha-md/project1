package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileEdit4 
{

WebDriver driver;
	
@FindBy(xpath = "//a[@data-nav-role='signin']")
WebElement accountAndList;

@FindBy(xpath = "//*[@id=\"selectProfileModalId\"]/div/button/div[2]/span")
WebElement manageprofiles;

@FindBy(linkText = "View")
WebElement view;

@FindBy(xpath = "//div[normalize-space()='Height and weight']")
WebElement height_weight;


@FindBy(xpath = "//button[normalize-space()='Add']")
WebElement Add_height_weight;

@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[2]/div[1]/div[2]/span[1]/div[2]/div[1]/div/input")
WebElement height;

@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[2]/div[1]/div[2]/span[2]/div[2]/div[1]/div/input")
WebElement weight;

@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']//input[@type='submit']")
WebElement save;

@FindBy(xpath = "//*[@id=\"accordionSection\"]/div[1]/div[1]")
WebElement Yourprofile;


public void accountAndList(WebDriver driver) {
	Actions actions = new Actions(driver);
	actions.moveToElement(accountAndList).perform();
}
	public void manageprofiles_button()
	{
		manageprofiles.click();
	}
	public void view_button()
	{
		view.click();
	}
	public void height_weight_button()
	{
		height_weight.click();
	}
	public boolean check_height_weight_button()
	{
		return Add_height_weight.isDisplayed();
	}	
	public void Add_height_weight_button()
	{
		 Add_height_weight.click();
	}
	public void Add_height_button()
	{
		height.sendKeys("150");
	}
	public void Add_weight_button()
	{
		weight.sendKeys("50");
	}
	public void save_button()
	{
		save.click();;
	}
	public void Your_profile_button()
	{
		Yourprofile.click();;
	}
	
	
	public ProfileEdit4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
