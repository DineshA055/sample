package sample;

import java.lang.annotation.Repeatable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class InstagramHomePage {
	
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="Log In")
	WebElement LoginLink;
	
	@FindBy(xpath="//input[contains(@name,'username')]")
	private WebElement Username;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement LogInButton;
	Loginlink.click();
}

   public void typeUsername(String EmailAddress) {
	   Username.sendKeys(EmailAddress);
   }
   public void typePassword(String PasswordText) {
	   Username.sendKeys(PasswordText);
   }
   public void clickSignInButton {
	   LogInButton.click();
   }
   public InstagramHomePage(WebDriver driverFromPreviousClass) {
	this.driver = driverFromPreviousClass;
	  PageFactory.initElements(driverFromPreviousClass, this);
   }

	
   
}
