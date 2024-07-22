package Package1.SeleniumProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listener.ListenerClass;
@Listeners(ListenerClass.class)
public class TestCase3 extends ListenerClass
{

	@Test
	public void login_to_Search()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		
		
		Amazon_login_page2 a1 = new Amazon_login_page2(driver);
		a1.un();
		a1.cont();
		a1.pwd();
		a1.sign();
		
		Amazon_Home_Page1 a2 = new Amazon_Home_Page1(driver);
		a2.searchbox();
		
		Amazon_SearchResult_Page3 result = new Amazon_SearchResult_Page3(driver);
		result.selectProduct();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> id1 =  windowHandles.iterator();
		 String PID =    id1.next();
		 String CID   =  id1.next();
		 driver.switchTo().window(CID);
		
		Amazon_Product_Page4 a3 = new Amazon_Product_Page4(driver);
		a3.shoeproduct();
		
		Assert.assertEquals(driver.getTitle(), "Buy OFF LIMITS Men's STUSSYY Comfortable, Stylish, Gym, Training, Sneakers, Running Shoe TAN/WHITE at Amazon.in", "testcase03-fail");
	}	
}
