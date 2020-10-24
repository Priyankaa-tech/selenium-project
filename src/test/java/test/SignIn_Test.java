package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import or.SignIn_Page;
import utilities.Base;
import utilities.PropertiesRead;
import utilities.Screenshot;

public class SignIn_Test extends Base{

	@Test
	public void signup() throws InterruptedException, IOException {
		SignIn_Page sign=new SignIn_Page(driver);

		if(driver.getTitle().equalsIgnoreCase("PRESTO:Tap On. Ride Easy.")) {
			sign.signin.click();
			//Reporter.log("clicked on the signin button");
			//test.log(LogStatus.PASS, "clicked on the signIn button");
			
			sign.id.sendKeys(PropertiesRead.readData("D:\\selenium\\project\\Project_Batch48\\src\\main\\java\\Execution.properties","id"));
			
			sign.pw.sendKeys(PropertiesRead.readData("D:\\selenium\\project\\Project_Batch48\\src\\main\\java\\Execution.properties","pw"));
			
			test=extent.createTest("signup");
			Assert.assertTrue(sign.signin.isEnabled()); 
		}}	
}
