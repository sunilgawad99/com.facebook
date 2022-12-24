package facebook.Pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@aria-label='Search Facebook'])[1]")
	WebElement searchBox;
	
	@FindBy(xpath="//li[@class='xh8yej3']")
	List<WebElement> list;
	
	@FindBy(xpath="//h1[text()='Suraj Jawale']")
	WebElement nam;
	
	

	public void headersButtonAndGetTittles()
	{
		ArrayList al= new ArrayList();
		
		for(int i=2;i<=5;i++)
		{
			al.add(driver.getTitle());
			driver.findElement(By.xpath("(//span[@class='x1n2onr6'])["+i+"]")).click();
			
			
			
		}
		System.out.println(al);
	}
	
	public void searchBox(String name)
	{
		searchBox.click();
		searchBox.sendKeys(name);
		for(WebElement ele : list)
		{
			String names = ele.getText();
			if(names.equals("suraj jawale"))
			{
			ele.click();
			break;
			}
		}
		String b =driver.getTitle();
		
	}
}
