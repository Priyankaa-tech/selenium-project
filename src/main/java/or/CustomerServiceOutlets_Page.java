package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceOutlets_Page {

public WebDriver driver;

	@FindBy(xpath = "//li[3][@class='dropdown']")public WebElement support;
	@FindBy(linkText = "Customer Service Outlets") public WebElement customerServiceOutlets;
	
	@FindBy(linkText = "Balance Checkers") public WebElement balanceCheckers;
	@FindBy(linkText = "Fare Vending Machines") public WebElement fareVendingMachines;
	@FindBy(linkText = "Self-Serve Reload Machines") public WebElement selfServeReloadMachines;
	@FindBy(linkText = "Ticket Vending Machines") public WebElement ticketVendingMachines;
	
	public CustomerServiceOutlets_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
}
