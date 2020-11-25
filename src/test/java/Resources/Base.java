package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.BillingPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	public static WebDriver driver;

	public Properties prop;

	public Actions a;
	

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Saicharan\\workspaceNEWPROJECT\\AutomationAssessment\\src\\test\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}

		else if (browserName.equals("IE")) {
			WebDriverManager.edgedriver().setup();
		}
		driver.manage().window().maximize();
		
		return driver;

	}
	
	public void sendText(WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public boolean isElementDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public void navigateTo()
	{
		driver.get(prop.getProperty("URL"));
	}
	
	public void tearDown()
	{
		driver.close();
	}
	
	public void JSEclick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", element);
	}
	
	

}
