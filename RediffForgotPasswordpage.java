package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



//Forgot Password Page class Implemented in Normal Page Object Pattern style
public class RediffForgotPasswordpage {

	WebDriver driver;

	// Constructor of RediffLoginpage class.Passing my test case driver into
	// RediffLoginpage.
	// hence we are transferring our capabilities from Test Case to our class.

	public RediffForgotPasswordpage(WebDriver driver) {
		this.driver = driver;
	}

	By emailid = By.xpath("//input[@id='txtlogin']");
	By NextButton = By.xpath("//input[@type='submit']");

	public WebElement EmailIdtextbox() {
		return driver.findElement(emailid);
	}

	public WebElement NextButton() {
		return driver.findElement(NextButton);
	}

}
