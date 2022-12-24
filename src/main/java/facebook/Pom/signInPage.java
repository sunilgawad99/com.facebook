package facebook.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {

	WebDriver driver;
	
	public signInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="email")
	WebElement mail;
	
	@FindBy(name="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement lobutton;
	
	public void login(String email,String password)
	{
		mail.sendKeys(email);
		pass.sendKeys(password);
		lobutton.click();
	}
	
	
	
	
	
	
}
