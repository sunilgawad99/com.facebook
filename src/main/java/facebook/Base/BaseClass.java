package facebook.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	WebDriver driver;
	
	
	public  WebDriver driverInitilization()
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
		
	}

}
