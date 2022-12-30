package facebook.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Groups_Tag {
	
	WebDriver driver;
	
	public Groups_Tag(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'])[16]" )
	WebElement groupButton;
	
	@FindBy(xpath="(//span[contains(text(),'Software Testing')])[3]")
	WebElement group;
	@FindBy(xpath = "//span[text()='Write something...']")
	WebElement write;
	
	
    //
	public void groups()
	{
		groupButton.click();
		Utility.waitUtilElementFound(group);
		Utility.scrollingAction(group);
		group.click();
		Utility.waitUtilElementFound(write);
		write.sendKeys("hey guys i looking for job change so any opening for AQ Automation with java,selenium in pune");
	}
	
	
	
	
}
