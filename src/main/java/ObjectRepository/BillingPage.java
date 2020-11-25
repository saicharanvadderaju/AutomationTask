package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {
	
WebDriver driver;//Test case driver
	
	public BillingPage(WebDriver driver) {
		this.driver=driver;//local driver
	}
	
By TotalPrice=By.xpath("//span[@id='total_price']");
	
	public WebElement Price() {
		return driver.findElement(TotalPrice);
	}

}
