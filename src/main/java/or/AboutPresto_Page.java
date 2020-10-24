package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPresto_Page {

	public WebDriver driver;

	@FindBy(xpath ="//span[text()='Find out more about PRESTO']")public WebElement aboutpresto;
	@FindBy(xpath = "//a[text()='PRESTO Card']") public WebElement Prestocard;
	
	@FindBy(xpath = "//li[@role='menuitem']/a[text()='Get a Card']") public WebElement getaPrestoCard;
	@FindBy(xpath = "//ul[@class='nav navbar-nav nav-left']/li[2]/ul/li[2]/a[text()='Load a Card']") public WebElement loadACard;
	@FindBy(xpath = "//div[@class='row']/descendant::a[text()='Lost or Damaged Card']") public WebElement lostOrDamagedCard;
	@FindBy(xpath = "//div[@class='row']/descendant::a[text()='FAQ']") public WebElement faq;
	
	@FindBy(linkText = "Get a Card: Where to Buy a PRESTO Card") public WebElement gatACard;  
	@FindBy(xpath = "//h1[text()='Load a PRESTO Card']") public WebElement loadYourCard;
	@FindBy(xpath = "//li[1]/a[text()='My PRESTO Account']")public WebElement prestoaccount;
	@FindBy(xpath ="//h1[text()='PRESTO FAQ - About PRESTO']")public WebElement prestoFaq;

	
	
	public AboutPresto_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
}
