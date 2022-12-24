package facebook.Pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	static WebDriver driver;

	public Utility(WebDriver driver) {
		Utility.driver=driver;
	}

	public static WebElement waitUtilElementFound(WebElement ele)
	{
		WebDriverWait ait = new WebDriverWait(driver,Duration.ofSeconds(60));
	return	ait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static void selectByVisibleTesxt(WebElement ele,String s)
	{
		Select sel= new Select(ele);
		sel.selectByVisibleText(s);
		
	}
	
	public static void selectByIndex(WebElement ele,int i)
	{
		Select sel= new Select(ele);
		sel.selectByIndex(i);
	}
	
	public static String getScreenShot(String testCaseName) throws IOException
	{
		String path= "E:\\Velocity\\facebook\\screenshots\\"+testCaseName+".png";
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti = new File(path);
		org.openqa.selenium.io.FileHandler.copy(source, desti);
		return path;
	}
	
	public static void getScreenShot(WebElement ele,String path) throws IOException
	{
		File source=ele.getScreenshotAs(OutputType.FILE);
		File desti=new File(path);
		org.openqa.selenium.io.FileHandler.copy(source, desti);
	}
	
	public static void scrollingAction(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0],scrollIntoView(true);", ele);
		
	}
	
	
}
