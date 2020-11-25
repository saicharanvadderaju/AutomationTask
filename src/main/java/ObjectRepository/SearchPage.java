package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
WebDriver driver;//Test case driver
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;//local driver
	}
	
	By SearchBox=By.xpath("//input[@id='search_query_top']");
	
	By SearchClick=By.xpath("//button[@name='submit_search']");
	
	public WebElement searchBox() {
		return driver.findElement(SearchBox);
	}
	
	public WebElement clickSearch() {
		return driver.findElement(SearchClick);
	}
}
