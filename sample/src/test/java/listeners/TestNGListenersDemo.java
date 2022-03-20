package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.id("aboutDisplayLink")).click();
		
		driver.findElement(By.xpath("link=Logout")).click();
		
		
		//driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		//driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Paul Collings");
		//driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("Admin");
		//driver.findElement(By.id("searchSystemUser_userType")).click();
		//Select objSelect = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		//objSelect.selectByIndex(1);
		
		
		//Select objSelect1 = new Select(driver.findElement(By.id("searchSystemUser_status")));
		//objSelect1.selectByIndex(1);
		
		//driver.findElement(By.id("searchBtn")).click();
		//driver.findElement(By.id("resetBtn")).click();
		
		//driver.findElement(By.id("btnAdd")).click();
		//driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Collings");
		//driver.findElement(By.name("systemUser[userName]")).sendKeys("Admin");
		//Select objSelect2 = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		//objSelect2.selectByIndex(1);
		//Select objSelect3 = new Select(driver.findElement(By.name("systemUser[userType]")));
		//objSelect3.selectByIndex(1);
		//driver.findElement(By.id("systemUser_password")).sendKeys("admin12345678");
		//driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("admin12345678");
		//driver.findElement(By.id("systemUser_userName")).sendKeys("Admin123");
		//driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Admin A");
		//driver.findElement(By.id("systemUser_userType")).sendKeys("Admin");
		//driver.findElement(By.id("btnSave")).click();
		//Select objSelect3 = new Select(driver.findElement(By.id("systemUser[employeeName][empName]")));
		//objSelect3.selectByIndex(1);
		//driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
	}
    
    @Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}
	
}


