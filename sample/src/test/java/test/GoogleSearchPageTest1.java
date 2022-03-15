package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.GoogleSearchPageObject1;

public class GoogleSearchPageTest1 {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		
		googleSearchPageTest1();
	}
	

	
	
	public static void googleSearchPageTest1() {
		
		
		 
		 String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		 
		
		 
		 GoogleSearchPageObject1 searchPageObj = new GoogleSearchPageObject1(driver);
		 
		
		 
		 
		 
		 driver.get("https://google.com");
		 
		
		 
		   searchPageObj.setTextInSearchBox("a b c");
		   searchPageObj.clickSearchButton("Keys.RETURN");
		   
		   driver.close();
		   
		 
		 
	}
}
