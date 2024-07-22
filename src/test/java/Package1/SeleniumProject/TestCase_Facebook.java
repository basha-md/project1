package Package1.SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_Facebook 
{
    @Test
	public void login_to_facebookpage_using_valid_credentials()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		
		Facebook_Login_Page fb = new Facebook_Login_Page(driver);
		fb.un();
		fb.pwd();
		fb.login();
		fb.createaccount();
		
	}
	
	
}
