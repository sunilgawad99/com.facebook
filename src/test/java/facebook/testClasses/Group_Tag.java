package facebook.testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import facebook.Base.BaseClass;
import facebook.Pom.Groups_Tag;
import facebook.Pom.Utility;
import facebook.Pom.signInPage;

public class Group_Tag {

	Groups_Tag tag;
	WebDriver driver;
	signInPage login;
	@BeforeClass
	@Parameters("browser")
	public void initilization(String browser)
	{

		BaseClass base = new BaseClass();
		driver=base.driverInitilization(browser);
		Utility ut = new Utility(driver);
		login= new signInPage(driver);
		tag = new Groups_Tag(driver);
	}
	
	@Test(priority = 2)
	public void openGroup()
	{
		tag.groups();
	}
	@Test(priority=1)
	public void verifyUserCanLogin() throws IOException
	{
		String actual="Photo/video";
		String expected=login.login();
		Assert.assertEquals(actual, expected);
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
}
