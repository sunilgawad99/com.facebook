package facebook.testClasses;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import facebook.Base.BaseClass;
import facebook.Pom.SignupForm;
import facebook.Pom.Utility;

public class User_can_signup_FB {
	
	
	SignupForm sf;
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void loadDriver(String browser)
	{
		BaseClass base = new BaseClass();
		driver=base.driverInitilization(browser);
		Utility ut = new Utility(driver);
		sf = new SignupForm(driver);
	}
	
	@Test(dataProvider = "testData")
	public void verifyUserCanClickOnNewAccount(Map<String,String> m)
	{
		sf.signUpForm();
		sf.enterFirstAndLastName(m.get("name"),m.get("lname"));
		sf.enterEmail(m.get("mail"));
		sf.enterPassword(m.get("pass"));
		sf.selectDate(m.get("date"));
		sf.selectMonth(m.get("month"));
		sf.selectYear(m.get("year"));
		sf.selectGender();
		//sf.signup();
	}
	
	@DataProvider(name="testData")
	public Object[][] data()
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "sunil");
		map.put("lname", "gawad");
		map.put("mail", "****89@gmail.com");
		map.put("pass", "****l@89");
		map.put("date", "8");
		map.put("month", "Jan");
		map.put("year", "2091");
		HashMap<String,String>map1= new HashMap<>();
		map1.put("name", "sai");
		map1.put("lname", "gawad");
		map1.put("mail", "****89@gmail.com");
		map1.put("pass", "*****@89");
		map1.put("date", "1");
		map1.put("month", "Dec");
		map1.put("year", "2025");
		Object [][] o={ {map},{map1}};
		return o;
	}
	//@AfterMethod
	public void unloadDriver() throws InterruptedException
	{
		driver.close();
		Thread.sleep(1000);
	}
	
	
	

}
