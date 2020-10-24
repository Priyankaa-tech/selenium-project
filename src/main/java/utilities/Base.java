package utilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Base {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	
	@BeforeClass
	public static void startTest()
	{
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
		//report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		//test = report.startTest("ExtentDemo");
	}
	/*
	@BeforeMethod
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Batch 48\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//int implicitWait = PropertiesRead.readIntData("D:\\Selenium Batch 48\\workspace\\SeleniumBatch48\\src\\wait_demo\\PropertyWait.properties", "ImplicitWait");
		//int pageLoad = PropertiesRead.readIntData("D:\\Selenium Batch 48\\workspace\\SeleniumBatch48\\src\\wait_demo\\PropertyWait.properties", "PageLoadTimeOut");
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(PropertiesRead.readData("D:\\Selenium Batch 48\\workspace\\WebUI_Testing\\Execution.properties", "url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}*/
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void setUp(@Optional("chrome") String browser) throws IOException {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver", "D:\\selenium\\driver\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("remotewebdriver")){
			DesiredCapabilities cap=new DesiredCapabilities();
				FirefoxOptions options=new FirefoxOptions();
				options.merge(cap);
			//ChromeOptions options =new ChromeOptions();
			//options.merge(cap);
			String hub="http://192.168.43.126:4444/wd/hub";
			driver=new RemoteWebDriver(new URL(hub),options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(PropertiesRead.readData("D:\\selenium\\project\\Project_Batch48\\src\\main\\java\\Execution.properties", "url"));		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	@AfterMethod(alwaysRun=true)
	public void getresult(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Test case failed due to below issues:",ExtentColor.RED));
		test.fail(result.getThrowable());
		test.fail("screenshot: "+test.addScreenCaptureFromPath(Screenshot.screenshot(driver)));
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED",ExtentColor.GREEN));	
	}
	else {
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case Skipped",ExtentColor.GREY));
		test.skip(result.getThrowable());
	}
}
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	@AfterClass
	public static void endTest()
	{
		//report.endTest(test);
		extent.flush();//it generate new test-report and delete previous report.
	}
}
