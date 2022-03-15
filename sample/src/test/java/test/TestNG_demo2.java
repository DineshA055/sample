package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo2 {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUptest() {      //first function doing the setup //this will run before running the test

		String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		//WebDriverManager.chromedriver();
		
		
}
	@Test
	public void googleSearch3() {    //this is the actual test //google function is the actual test 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.RETURN);
		//driver.findElement(By.name("Submit")).sendKeys("keys.Submit");
		//driver.findElement(By.linkText("Login")).click();
		// driver.findElement(By.linkText("btnLogin")).click();
		 //driver.findElement(By.id("SubmitLogin"));
		//driver.findElement(href="/index.php/auth/logout");
		//driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated",Keys.RETURN);
		//WebElement signOut = driver.findElement(By.name("Log Out"));
		driver.findElement(By.linkText("logout"));
	}
	
	@AfterTest
	public void tearDownTest() {   //this should run after the test is over
			
		
		System.out.println("test completed successfully");
		
		
	}
}
