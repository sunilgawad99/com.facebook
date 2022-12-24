package facebook.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupForm extends Utility {
	
	
	WebDriver driver;
	
	public SignupForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Create New Account']")
	WebElement singupButton;
	
	public void signUpForm()
	{
		Utility.waitUtilElementFound(singupButton);
		singupButton.click();
	}

	@FindBy(name="firstname")
	WebElement fname;
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="reg_email__")
	WebElement email;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement remail;
	
	@FindBy(name="reg_passwd__")
	WebElement pass;
	@FindBy(name="birthday_day")
	WebElement day;
	
	@FindBy(name="birthday_month")
	WebElement month;
	
	@FindBy(name="birthday_year")
	WebElement year;
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement sex;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement signup;
	public void enterFirstAndLastName(String name,String laname)
	{
		Utility.waitUtilElementFound(fname);
		fname.sendKeys(name);
		Utility.waitUtilElementFound(lname);
		lname.sendKeys(laname);
	}
	
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
		Utility.waitUtilElementFound(remail);
		remail.sendKeys(mail);
		
	}
	
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	
	public void selectDate(String date)
	{
		int i =Integer.parseInt(date);
		Utility.selectByIndex(day, i);
	}
	
	public void selectMonth(String mo)
	{
		Utility.selectByVisibleTesxt(month,mo);
	}
	public void selectYear(String yy)
	{
		Utility.selectByVisibleTesxt(year, yy);
	}
	
	public void selectGender()
	{
		sex.click();
	}
	
	public void signup()
	{
		
		signup.click();
	}
}
