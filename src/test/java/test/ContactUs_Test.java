package test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import or.ContactUs_Page;
import utilities.Base;
import utilities.Screenshot;
import utilities.Waits;

public final class ContactUs_Test extends Base{

	@Test
	public void contactUs() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
			ContactUs_Page page = new ContactUs_Page(driver);
			page.support.click();
			page.contactUs.click();
			/*
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			 */
			test=extent.createTest("contactUs");
			Assert.assertTrue(page.ContactPresto.isDisplayed());
		}
	}
	@Test
	public void byChat() throws IOException, InterruptedException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
			ContactUs_Page page = new ContactUs_Page(driver);
			page.support.click();
			page.contactUs.click();
			page.byChat.click();
			test=extent.createTest("byChat");
			Assert.assertTrue(page.chat.isDisplayed());
		}		
	}

	@Test
	public void byemail() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
			ContactUs_Page page = new ContactUs_Page(driver);	
			page.support.click();
			page.contactUs.click();
            test=extent.createTest("byemail");
			Assert.assertTrue(page.byEmail.isDisplayed());
		}}
	@Test
	public void byphone() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
			ContactUs_Page page = new ContactUs_Page(driver);
			page.support.click();
			page.contactUs.click();
			 test=extent.createTest("byphone");
			Assert.assertTrue(page.byphone.isDisplayed());
		}
	}
}
