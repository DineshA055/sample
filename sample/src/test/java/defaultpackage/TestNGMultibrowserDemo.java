package defaultpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultibrowserDemo {
	
	WebDriver driver = null;
	 String projectPath = System.getProperty("user.dir");
	@Parameters("browsername")
	 @BeforeTest
	
	public void setup(String browserName) {   //create a method for Multi-browser
       System.out.println("Browser name is : "+browserName);
       System.out.println("Thread id : "+Thread.currentThread().getId());
       if(browserName.equalsIgnoreCase("chrome")) {
    	
   		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
   		//WebDriverManager.chromedriver().setup(); 
   		driver = new ChromeDriver();
       }
       
       else if(browserName.equalsIgnoreCase("firefox")){
    	   System.setProperty("webdriver.gecko.driver", projectPath+"/driver/firefox.exe"); 
    	   driver = new FirefoxDriver();
       }
       else if(browserName.equalsIgnoreCase("ie")){
    	   System.setProperty("webdriver.ie.driver", projectPath+"/driver/IEDriverServer.exe"); 
    	   driver = new InternetExplorerDriver();
    	   
}
	}
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
	    Thread.sleep(400);
	}
	
	public void teardown() {
		driver.close();
		System.out.println("Test completed ");
		
	}
}
