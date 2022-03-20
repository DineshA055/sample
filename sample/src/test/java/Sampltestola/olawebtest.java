package Sampltestola;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class olawebtest {
	
	public static void main(String[] args) {
		
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("WebDriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver","C:\\Selenium all\\Chrome driver for selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.olacabs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Current location')]")).sendKeys("chennai");
		
	}

}
