package facebook.Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

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
	@FindBy(xpath = "//span[text()='Photo/video']")
	WebElement photo;
	
	public String login() throws IOException
	{
		
		mail.sendKeys(Utility.getConfigData("Uname"));
		pass.sendKeys(Utility.getConfigData("Upass"));
		lobutton.click();
		Utility.waitUtilElementFound(photo);
		return photo.getText();
	}
	
	
	
	
	
	
}
