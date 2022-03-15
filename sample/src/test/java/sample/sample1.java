package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {

	private static List<WebElement> listOfInputElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name]")).sendKeys("step by step automation");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement textbox = driver.findElement(By.id("lst-ib"));
		//textbox.sendKeys("Step");
		
		driver.quit();
		}
	}

