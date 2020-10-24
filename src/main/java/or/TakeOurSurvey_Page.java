package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeOurSurvey_Page {
	public WebDriver driver;
	@FindBy(xpath = "//li[3][@class='dropdown']")public WebElement support;
	
	@FindBy(xpath = "//a[text()='Support']/following-sibling::ul/li[4]/a[text()='Take our Survey']")public WebElement takeoursurvey;
	@FindBy(linkText ="Take Our Survey!")public WebElement takeoursurveyVT;
	@FindBy(xpath ="//div[@class='container']/div/div[2]/img")public WebElement img;
	
	@FindBy(id = "inputCTID39")public WebElement customersatisfactionsurvey;
	@FindBy(xpath = "//div[@id='reactApp']/div/section/section/strong/text()")public WebElement vt;

	public TakeOurSurvey_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
