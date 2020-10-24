package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import or.CustomerServiceOutlets_Page;
import utilities.Base;
import utilities.Screenshot;
import utilities.Waits;

public class CustomerServiceOutlets_Test extends Base{

	@Test
	public void farevending() throws InterruptedException, IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		CustomerServiceOutlets_Page page=new CustomerServiceOutlets_Page(driver);
		page.support.click();
		page.customerServiceOutlets.click();
		
		page.fareVendingMachines.click();
		Waits.explicitWait(60,page.fareVendingMachines);
		
		 test=extent.createTest("farevending");
		 Assert.assertTrue(page.fareVendingMachines.isDisplayed());
		}
	}
	@Test
	public void balancechecker() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		CustomerServiceOutlets_Page page=new CustomerServiceOutlets_Page(driver);
		page.support.click();
		page.customerServiceOutlets.click();
		
		page.balanceCheckers.click();
		Waits.explicitWait(60,page.balanceCheckers);
		
		 test=extent.createTest("balancechecker");
		Assert.assertTrue(page.balanceCheckers.isDisplayed());
		}
	}
	@Test
	public void selfservice() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		CustomerServiceOutlets_Page page=new CustomerServiceOutlets_Page(driver);
		page.support.click();
		page.customerServiceOutlets.click();
		
		page.selfServeReloadMachines.click();
		Waits.explicitWait(60,page.selfServeReloadMachines);
		
		 test=extent.createTest("selfService");
		Assert.assertTrue(page.selfServeReloadMachines.isDisplayed());
		}
	}
	@Test
	public void ticketvendingmachine() throws IOException {
		
		if(driver.getTitle().equalsIgnoreCase("PRESTO: Tap On. Ride Easy.")) {
		CustomerServiceOutlets_Page page=new CustomerServiceOutlets_Page(driver);
		page.support.click();
		page.customerServiceOutlets.click();
		
		page.ticketVendingMachines.click();
		Waits.explicitWait(60,page.ticketVendingMachines);
		
		 test=extent.createTest("ticketvendingmachine");
		Assert.assertTrue(page.ticketVendingMachines.isDisplayed());
		}
	}
}
