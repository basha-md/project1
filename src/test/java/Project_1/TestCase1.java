package Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1.NewUserRegister1;

public class TestCase1 
{
	@Test
	public void login_to_Search()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&showRememberMe=true&openid.pape.max_auth_age=0&pageId=inflex&prepopulatedLoginId=&openid.assoc_handle=inflex&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&policy_handle=Retail-Checkout");
		driver.manage().window().maximize();
		
		NewUserRegister1 n1 = new NewUserRegister1(driver);
		n1.mobile();
		n1.customername();
		n1.pwd();
		n1.continuebutton();
		
		//Assert.assertEquals(, null, null)
		
	}
}
