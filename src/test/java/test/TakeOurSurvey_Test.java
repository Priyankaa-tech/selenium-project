package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import or.TakeOurSurvey_Page;
import utilities.Base;
import utilities.Waits;

public class TakeOurSurvey_Test extends Base {
	@Test
	public void takeoursurvey() throws IOException {
		
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		TakeOurSurvey_Page  page=new  TakeOurSurvey_Page  (driver);
		page.support.click();
		page.takeoursurvey.click();
		
		test=extent.createTest("takeoursurvey");
		//Assert.assertTrue(page.img.isDisplayed());
		boolean b=page.img.isDisplayed();	
		test.info("img is displayed: "+b);
		
		}
	}
	@Test
	public void customersurvey() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		TakeOurSurvey_Page  page=new  TakeOurSurvey_Page (driver);
		page.support.click();
		page.takeoursurvey.click();

		page.customersatisfactionsurvey.click();
		Waits.explicitWait(60, page.customersatisfactionsurvey);
		
		test=extent.createTest("customersurvey");
		//Assert.assertTrue(page.vt.isDisplayed());
		boolean v=page.vt.isDisplayed();
		System.out.println(v);
		}
	}
}
