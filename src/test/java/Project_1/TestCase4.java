package Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Project1.InvalidCredentials3;
import Project1.ProfileEdit4;
import Project1.ValidCredentials2;

public class TestCase4 
{

	@Test
	public void login_to_Search() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		ValidCredentials2 v1 = new ValidCredentials2(driver);
		v1.un();
		v1.cont();
		v1.pwd();
		v1.sign();
		
		ProfileEdit4 p1 = new ProfileEdit4(driver);
		p1.accountAndList(driver);
		p1.manageprofiles_button();
		p1.view_button();
		Thread.sleep(1000);
		
		p1.height_weight_button();
		//p1.check_height_weight_button();
		p1.Add_height_weight_button();
		p1.Add_height_button();
		p1.Add_weight_button();
		Thread.sleep(1000);
		
		p1.save_button();
		p1.Your_profile_button();
		
	}
	

}
