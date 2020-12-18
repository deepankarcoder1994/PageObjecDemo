package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Login page class Implemented in Page Object factory Pattern style.
public class RediffLoginpagePageFactory {
	
	//private WebDriver webDriver;
	WebDriver driver;
	
	//Constructor of RediffLoginpage class.Passing my test case driver into RediffLoginpage.
	//hence we are transferring our capabilities from Test Case to our class.
	
	public RediffLoginpagePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Successfully we have converted your Login page from Normal page to page Object factory style.
	//FindBy Annotation Demo
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement go;
	
	@FindBy(linkText="Forgot Password?")
	WebElement forgotpassword;
	
	
	public WebElement Emaild() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	
	public WebElement submit() {
		return go;
	}
	
	public WebElement forgotPassword() {
		return forgotpassword;
	}
	
}
