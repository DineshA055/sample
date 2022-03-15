package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		 // create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter();
		
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One","this is a test1 to validate google search successfully");
	       
        String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 test1.log(Status.INFO,"Starting Test cases");
		 driver.get("https://google.com");
		 test1.pass("Navigated to google.com");
		 driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated",Keys.RETURN);
		 test1.pass("Entered text in Searchbox");
		 test1.pass("Pressed Keyboard enetr key");
		 driver.close();
		 driver.quit();
		 test1.info("Test Complted");
		 
		// calling flush writes everything to the log file
	        extent.flush();
	}
	

}
