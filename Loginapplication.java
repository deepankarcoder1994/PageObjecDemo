package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffForgotPasswordpage;
import objectrepository.RediffForgotPasswordpagePageFactory;
import objectrepository.RediffLoginpage;

/*
 * 
 * Creating two different page object Classes and accessing the methods to manipulate the different properties in those pages.
 * 
 */

public class Loginapplication {
	//Login page class Implemented in Normal Page Object Pattern style.
	//Forgot Password Page class Implemented in  Page Object factory Pattern style.
	
	

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal_docs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//The username, password now should come from Object repository. You must not hardcode
		// the values.
		//Creating a object of RediffLoginPage class and accessing the Email id method.It implements easy readibility of Tests.
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("4567");
		//rd.submit().click();
		rd.forgotPassword().click();
		Thread.sleep(3000);
		
		//Creating object of RediffForgotPasswordpagePageFactory class to access that particular page properties.
		RediffForgotPasswordpagePageFactory rf = new RediffForgotPasswordpagePageFactory(driver);
		rf.EmailIdtextbox().sendKeys("deepankars");
		rf.NextButton().click();
		
		
	}
}
