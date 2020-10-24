
package test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import or.AboutPresto_Page;
import utilities.Base;
import utilities.Waits;

public class AboutPresto_Test extends Base{

	@Test
	public void getAPrestoCard() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
			AboutPresto_Page page = new AboutPresto_Page(driver);
			page.Prestocard.click();
			page.getaPrestoCard.click();
			Waits.explicitWait(60, page.getaPrestoCard); 
			/*
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			 */
			test=extent.createTest("getAPrestoCard");
			Assert.assertTrue(page.gatACard.isDisplayed());
		}}
	@Test
	public void loadingYourCard() throws IOException {
		AboutPresto_Page page = new AboutPresto_Page(driver);
		page.Prestocard.click();
		page.loadACard.click();

		Waits.explicitWait(60, page.loadACard);
	
		test=extent.createTest("loadingYourCard");	
		Assert.assertTrue(page.loadYourCard.isDisplayed());
		}
	@Test
	public static void lostordamagedcard() throws IOException {
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		AboutPresto_Page page = new AboutPresto_Page(driver);
		page.lostOrDamagedCard.click();

		Waits.explicitWait(60, page.lostOrDamagedCard);
		
		test=extent.createTest("lostordamagedcard");
		Assert.assertTrue(page.prestoaccount.isDisplayed());
	}}
	@Test
	public void faq() throws IOException {
	
		if(driver.getTitle().equals("PRESTO: Tap On. Ride Easy.")) {
		AboutPresto_Page page = new AboutPresto_Page(driver);
		page.faq.click();

		Waits.explicitWait(60, page.faq);
		
		test=extent.createTest("faq");
		Assert.assertTrue(page.prestoFaq.isDisplayed());	
}}}
