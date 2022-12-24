package facebook.Pom;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
	
	
	WebDriver driver;
	
	public ProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(xpath="(//span[text()='Sunil Gawad'])[1]")
	WebElement pname;
	
	
	@FindBy(xpath = "//span[text()='Add to Story']")
	WebElement addStory;
	
	
	@FindBy(xpath = "//div[text()='Create a Text Story']")
	WebElement createStory;
	
	@FindBy(xpath = "//span[text()='Start typing']")
	WebElement enterText;
	
	@FindBy(css = "[class*='x4p3wbt x10l6tqk']")
	WebElement clickOnIt;
	
	
	@FindBy(xpath = "//div[@class=\"x6s0dn4 x78zum5 x1nhvcw1\"]")
	List<WebElement> options;
	
	@FindBy(xpath = "(//div[@class='x16wdlz0 x1guw455'])[15]")
	WebElement colors;
	
	@FindBy(xpath = "//div[@class='x5yr21d']")
	WebElement shot;
	
	@FindBy(xpath = "//span[text()='Share to Story']")
	WebElement shre;
	
	By enter= By.xpath("enterText");
	
	public void clickOnProfileLink()
	{
		pname.click();
		System.out.println(driver.getTitle());;
	}
	public void addStory(String story) throws IOException, InterruptedException
	{
		
		Utility.waitUtilElementFound(addStory);
		addStory.click();
		
		Utility.waitUtilElementFound(createStory);
		
		createStory.click();
		
		
		
	    driver.findElement(enter).click();
		driver.findElement(enter).sendKeys(story);
		
		
		clickOnIt.click();
		for(WebElement ele:options)
		{
			String op=ele.getText();
			if(op.equals("fancy"))
			{
				ele.click();
			}
		}
		colors.click();
		
		
		shre.click();
	}
	
	
	
	
	
	
}
