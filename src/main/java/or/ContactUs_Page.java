package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs_Page {

public WebDriver driver;
    @FindBy(xpath = "//li[3][@class='dropdown']")public WebElement support;
   
    @FindBy(xpath = "//a[text()='Support']/following-sibling::ul/li[5]/a[text()='Contact Us']")public WebElement contactUs;
	@FindBy(xpath  = "//h1[text()='Contact PRESTO']") public WebElement ContactPresto;
	
	@FindBy(xpath = "//span[text()='By Chat']") public WebElement byChat;
	 @FindBy(xpath = "//a[text()='Chat']") public WebElement chat;
	 @FindBy(className = "fa fa-times")public WebElement crossbutton;
	 
	@FindBy(xpath = "//span[text()='By E-mail ']") public WebElement byEmail;
    @FindBy(xpath = "//a/span[text()='By Phone']") public WebElement byphone;
   
	public ContactUs_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
}
