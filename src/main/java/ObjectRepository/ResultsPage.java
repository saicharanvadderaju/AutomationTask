package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
	
WebDriver driver;//Test case driver
	
	public ResultsPage(WebDriver driver) {
		this.driver=driver;//local driver
	}
	
By PrintedChiffronDress=By.xpath("//ul[@class='block_content products-block']//a[normalize-space(text())='Printed Chiffon Dress']");
	
	public WebElement clickonProduct() {
		return driver.findElement(PrintedChiffronDress);
	}

	By AddtoCart=By.xpath("//span[normalize-space(text())='Add to cart']");
	
	public WebElement ProducttoCart() {
		return driver.findElement(AddtoCart);
	}
	
By ProceedtoCheckout=By.xpath("//div[@class='button-container']//span[normalize-space(text())='Proceed to checkout']");
	
	public WebElement proceedtoChkout() {
		return driver.findElement(ProceedtoCheckout);
	}
}
