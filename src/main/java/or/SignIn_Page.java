package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	public WebDriver driver;

	@FindBy(xpath = "//li[@class='modalLogin signin']/a[text()='Sign in / Sign up']")public WebElement signin;
	@FindBy(xpath ="//input[@id='SignIn_Username']")public WebElement id;
	@FindBy(xpath ="//input[@id='SignIn_Password']")public WebElement pw;


	public SignIn_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}



