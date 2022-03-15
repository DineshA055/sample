package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUptest() {      //first function doing the setup //this will run before running the test

		String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		//WebDriverManager.chromedriver();
		
		
}
	@Test
	public void googleSearch() {    //this is the actual test //google function is the actual test 
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated",Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest() {   //this should run after the test is over
			
		driver.close();
		System.out.println("test completed successfully");
		
		
	}
}
