package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject1 {
	
	 WebDriver driver = null;
	
	//By textbox_search = By.id("lst-ib");
	
	//By button_search  = By.name("btnk");
	
    By textbox_search = By.xpath("//input[@name]");
	
	By button_search  = By.name("btnK");
	
	
	public GoogleSearchPageObject1(WebDriver driver) {
	     this.driver = driver;  
	}

	
	public void setTextInSearchBox(String text) {
		
		
		
		driver.findElement(textbox_search).sendKeys(text);
		                              
	}
	
	


	



	public void clickSearchButton(String text) {
		// TODO Auto-generated method stub
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}


            
