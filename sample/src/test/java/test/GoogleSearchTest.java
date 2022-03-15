package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

   
public class GoogleSearchTest {
	
	public static void main(String[] args) {
		googleSearch();
		
	}

	public static void googleSearch() {
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		//driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated",Keys.RETURN);
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step",Keys.RETURN);
		
		
		
		
	}
}

