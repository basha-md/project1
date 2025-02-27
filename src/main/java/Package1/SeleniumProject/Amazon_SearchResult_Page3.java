package Package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page3
{
	

	WebDriver driver;

	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement selectShoe;

	public void selectProduct() {
		selectShoe.click();
	}

	public Amazon_SearchResult_Page3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
