package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Forgot Password Page class Implemented in  Page Object factory Pattern style.
public class RediffForgotPasswordpagePageFactory {

	WebDriver driver;

	// Constructor of RediffLoginpage class.Passing my test case driver into
	// RediffLoginpage.
	// hence we are transferring our capabilities from Test Case to our class.

	public RediffForgotPasswordpagePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * By emailid = By.xpath("//input[@id='txtlogin']"); By NextButton =
	 * By.xpath("//input[@type='submit']");
	 */
	
	@FindBy(xpath="//input[@id='txtlogin']")
	WebElement emailid;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement NextButton;

	public WebElement EmailIdtextbox() {
		return emailid;
	}

	public WebElement NextButton() {
		return NextButton;
	}

}
