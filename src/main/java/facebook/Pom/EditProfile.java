package facebook.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditProfile {
	
	WebDriver driver;
	 
	 public EditProfile(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath="(//span[text()='Sunil Gawad'])[1]")
		WebElement pname;
	 
	// @FindBy(xpath = "//span[text()='Edit profile']")
	 

}
