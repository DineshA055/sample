package test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Lambda {
public static void main(String[] args) throws InterruptedException, AWTException {
       System.setProperty("webdriver.chrome.driver", "C:\\Selenium all\\Chrome driver for selenium\\chromedriver_win32\\chromedriver.exe");
   
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.lambdatest.com/feature");
       Actions actions = new Actions(driver);
       WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"vid\"]"));
      actions.contextClick(elementLocator).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
       Actions action = new Actions(driver);
       action.contextClick(elementLocator).build().perform();
       Robot robot = new Robot();
       
   }
}