package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver = null;
	@BeforeTest
	public void setUptest() {      
		String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys();
	}

	
	@Test(dataProvider = "test1data")
	public void test1(String Username, String Password ) {
		System.out.println(Username+" | "+Password);
		//driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com");
		//driver.get("https://google.com");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
		
		
	
	}
	
	// Create a function and provide testNG annotation
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		//Call the excel data provider function with excel and sheetName
		String excelPath = "C:\\Selenium all\\Selenium project\\sample\\excel\\data.xlsx";
		
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	public  Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data [][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+" | ");
				data[i-1][j]= cellData;
			}
		System.out.println();	
		}
		return data;
	}
		

}
