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
	 
	 @FindBy(xpath = "//span[text()='Edit profile']")
	 WebElement editProfile;
	 
	 @FindBy(xpath = "//span[text()='Edit Your About Info']")
	 WebElement edit;
	 
	 @FindBy(xpath = "//a[@aria-label='Edit']")
	 WebElement editMobile;
	 
	 @FindBy(xpath = "(//a[text()='Remove'])[2]")
	 WebElement remove;
	 
	 @FindBy(xpath = "//button[@id='u_0_l_+U']")
	 WebElement reNumber;
	 

	 public void editProfile()
	 {
		 Utility.waitUtilElementFound(pname);
		 pname.click();
		 Utility.waitUtilElementFound(editProfile);
		 editProfile.click();
		 Utility.waitUtilElementFound(edit);
		 Utility.scrollingAction(edit);
		 edit.click();
		 Utility.waitUtilElementFound(editMobile);
		 editMobile.click();
		 remove.click();
		 Utility.waitUtilElementFound(reNumber);
		 reNumber.click();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
