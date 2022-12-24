package facebook.testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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
	public void initilization()
	{

		BaseClass base = new BaseClass();
		driver=base.driverInitilization();
		Utility ut = new Utility(driver);
		login= new signInPage(driver);
		home = new HomePage(driver);
		pro = new ProfilePage(driver);
		edit = new EditProfile(driver);
	}
	
	@Test(priority=1)
	public void verifyUserCanLogin()
	{
		String userName="facebookID";
		String pass="facebookPass";
		login.login(userName, pass);
	}
	
	@Test(enabled = false)
	public void homePage()
	{
		String expected="suraj jawale";
		home.headersButtonAndGetTittles();
		home.searchBox(expected);
		//Assert.assertEquals(atual,expected);
		
		
	}
	
	
	@Test(dependsOnMethods = {"verifyUserCanLogin"})
	public void shareStroy() throws IOException, InterruptedException
	{
		String story="Hello every one";
		
		pro.clickOnProfileLink();
		pro.addStory(story);
		
	}
	
	@Test(dependsOnMethods = {"verifyUserCanLogin"})
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
