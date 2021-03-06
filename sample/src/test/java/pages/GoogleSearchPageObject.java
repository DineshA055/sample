package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	 By textbox_search = By.id("lst-ib");
	 
	 By button_search = By.name("btnk");   // object locator 
	 
	 public GoogleSearchPageObject(WebDriver driver) {
		 this.driver = driver;     //Created the constructor 
	 }
	 
	 public void setTextInSearchBox(String text) {
		 
		 driver.findElement(textbox_search).sendKeys(text);
	 }
	 
	 public void clickSearchButton() {
		 driver.findElement(button_search).sendKeys(Keys.RETURN);
	 }

}
