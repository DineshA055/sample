package defaultpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		// System.setProperty("webdriver.chrome.driver", projectPath+"/driver/IEDriverServer.exe");
		// WebDriver driver = new InternetExplorerDriver();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModesettings", true);
		
		 WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver(caps);
         driver.get("https://google.com");
        // driver.findElement(By.xpath("//input[@name]")).sendKeys("ABCD");
         //driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
         driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated",Keys.RETURN);
         driver.close();
         driver.quit();
	}

}
