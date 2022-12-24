package facebook.testClasses;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import facebook.Base.BaseClass;
import facebook.Pom.EditProfile;
import facebook.Pom.HomePage;
import facebook.Pom.ProfilePage;
import facebook.Pom.Utility;
import facebook.Pom.signInPage;

public class LoginTest {

	WebDriver driver;
	signInPage login;
	HomePage home;
	ProfilePage pro;
	EditProfile edit;
	@BeforeClass
	@Parameters("browser")
	public void initilization(String browser)
	{

		BaseClass base = new BaseClass();
		driver=base.driverInitilization(browser);
		Utility ut = new Utility(driver);
		login= new signInPage(driver);
		home = new HomePage(driver);
		pro = new ProfilePage(driver);
		edit = new EditProfile(driver);
	}
	
	@Test(priority=1)
	public void verifyUserCanLogin() throws IOException
	{
		String actual="Photo/video";
		String expected=login.login();
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(enabled = false)
	public void homePage()
	{
		String expected="suraj jawale";
		home.headersButtonAndGetTittles();
		home.searchBox(expected);
		//Assert.assertEquals(atual,expected);
		
		
	}
	
	
	@Test(dependsOnMethods = {"verifyUserCanLogin"},enabled = false)
	public void shareStroy() throws IOException, InterruptedException
	{
		String story="Hello every one";
		
		pro.clickOnProfileLink();
		pro.addStory(story);
		
	}
	
	@Test(priority = 2)
	public void editProfile()
	{
		
		edit.editProfile();
		
	}
	
	@DataProvider(name="testData")
	public Object[][] getData()
	{
		Object o[][]= {{""},{""}};
		return o;
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
}
