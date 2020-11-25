package StepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.BillingPage;
import ObjectRepository.ResultsPage;
import ObjectRepository.SearchPage;
import Resources.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidatingPriceforAddedProduct extends Base{
	SearchPage sp;
	ResultsPage RP;
	BillingPage BP;
	
	
	@Given("User is on automationpractice page")
	public void user_is_on_automationpractice_page() throws Exception {
	    
		driver=initializeDriver();
		
		navigateTo();
	}


	@When("user enter {string} in search box")
	public void user_enter_in_search_box(String product) {
	   
		//if(isElementDisplayed(sp.searchBox()))
		 sp=new SearchPage(driver);
			click(sp.searchBox());
			sendText(sp.searchBox(),product);
		
	}
	
	
	@When("user clicks on search Button")
	public void user_clicks_on_search_button() {
	    click(sp.clickSearch());
	}
	
	
	@When("user clicks on PRINTED CHIFFRON DRESS result")
	public void user_clicks_on_printed_chiffron_dress_result() throws Exception {
		 RP=new ResultsPage(driver);
		 
		 click(RP.clickonProduct());
		 
		
		 
	}
	
	
	@When("user clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() throws Exception {
	    
		click(RP.ProducttoCart());
		Thread.sleep(4000);
	}
	
	
	@When("user clicks on proceed to checkout button")
	public void user_clicks_on_proceed_to_checkout_button() {
		
		JSEclick(RP.proceedtoChkout());
	   
	}
		
	
	@When("verifies total prrice to {string}")
	public void verifies_total_prrice_to(String price) {
	    
		 BP=new BillingPage(driver);
		 String extractedprice=BP.Price().getText();
		 System.out.println(extractedprice);
		 
		 assertEquals(price,extractedprice.replace("$", ""));
		 
		 tearDown();
		 
	}


}
