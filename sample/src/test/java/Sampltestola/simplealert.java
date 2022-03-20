package Sampltestola;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplealert{
 public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Selenium all\\Chrome driver for selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
  // This step will result in an alert on screen
    driver.findElement(By.id("alertButton")).click();
    Alert simpleAlert = driver.switchTo().alert();
    simpleAlert.accept();
  }
}



//disable pop up knowledge

//1: Create a instance of ChromeOptions class ChromeOptions options = new ChromeOptions();
//2: Add Chrome switch to disable notification – “–disable-notifications” options.addArguments("--disable-notifications");
//3: Set path for the Chrome driver.