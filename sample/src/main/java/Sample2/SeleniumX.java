package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumX {
	WebDriver driver = null;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium all\\Chrome driver for selenium\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.borland.com/gmopost/");
	      String homepage = driver.getTitle();
	      System.out.println("Navigate to:" + homepage);
	      driver.findElement(By.xpath("//[@name='bSubmit']")).click();
	      System.out.println("Navigate to:" +driver.getTitle());
	      
	      WebElement element = driver.findElement(By.name("QTY_GLASSES"));
	      element.clear();
	      element.sendKeys("s");
	      driver.findElement(By.name("bSubmt")).click();
	      System.out.println("Navigate to:" +driver.getTitle());
	      driver.findElement(By.name("bSubmt")).click();
	      System.out.println("Navigate to:" +driver.getTitle());
	      driver.findElement(By.name("billName")).sendKeys("Raghav");
	      driver.findElement(By.name("billAddress")).sendKeys("Raghav");
	      driver.findElement(By.name("billCity")).sendKeys("Raghav");
	      driver.findElement(By.name("billState")).sendKeys("Raghav");
	      driver.findElement(By.name("billZipCode")).sendKeys("101");
	      driver.findElement(By.name("billPhone")).sendKeys("9894439604");
	      driver.findElement(By.name("billEmail")).sendKeys("something@live.com");
	
	}
	
	
	
	

}
