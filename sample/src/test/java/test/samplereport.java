package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class samplereport {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        ExtentReports extent = new ExtentReports();
	        ExtentTest test = extent.createTest("Test Name");
	        ExtentTest test1 = extent.createTest("Google Search Test One","this is a test to validate google search successfully");
	        String projectPath = System.getProperty("user.dir");
			 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
			 driver = new ChromeDriver();
			 test1.log(Status.INFO,"Starting Test cases");
			 driver.get("https://google.com");
	        test.pass("Passed");
	        driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated",Keys.RETURN);
			 test1.pass("Entered text in Searchbox");
			 test1.pass("Pressed Keyboard enetr key");

	        ExtentHtmlReporter reporter = new ExtentHtmlReporter("output/test.html");
	        extent.attachReporter();
	        extent.flush();
	        
	    }
	}


