package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListenersDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
    @Test
	public void test2() {
		System.out.println("I am inside test 2");
		
		String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name]")).sendKeys("Automated");
		driver.findElement(By.name("//input[@name=abc]")).sendKeys("abc");
		
		driver.close();
	}
    
    @Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}
	
}


