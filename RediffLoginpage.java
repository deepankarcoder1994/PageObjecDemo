package objectrepository;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//Login page class Implemented in Normal Page Object Pattern style.
public class RediffLoginpage {
	
	WebDriver driver;
	
	//Constructor of RediffLoginpage class.Passing my test case driver into RediffLoginpage.
	//hence we are transferring our capabilities from Test Case to our class.
	
	public RediffLoginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By go = By.xpath("//input[@name='proceed']");
	By forgotpassword = By.linkText("Forgot Password?");
	
	public WebElement Emaild() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	
	public WebElement submit() {
		return driver.findElement(go);
	}
	
	public WebElement forgotPassword() {
		return driver.findElement(forgotpassword);
	}
}
