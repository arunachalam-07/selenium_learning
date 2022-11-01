package data_driven_framework4usingjxl;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class TestUsingJXL {

	
	@Test(dataProvider = "loginDataProvider")
	
	public void Login(String username,String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement usernameElement = driver.findElement(By.xpath("//div[@id=\"app\"]//input[@name=\"username\"]"));
		WebElement passwordElement = driver.findElement(By.xpath("//div[@id=\"app\"]//input[@name=\"password\"]"));
		WebElement buttonElement = driver
				.findElement(By.xpath("//div[@id=\"app\"]//button[@type=\"submit\"]"));

		usernameElement.sendKeys(username);
		passwordElement.sendKeys(password);
		buttonElement.click();
		driver.close();
	}

	@DataProvider(name="loginDataProvider")
	public String[][] readData() throws Exception {

		FileInputStream file;
		Workbook currentWorkBook;
		Sheet currentSheet;
		int rows, columns;
		String[][] testData;

		file = new FileInputStream(
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/Data_driven_framework_hands_on/TestData.xls");

		currentWorkBook = Workbook.getWorkbook(file);
		currentSheet = currentWorkBook.getSheet("Sheet1");
		rows = currentSheet.getRows();
		columns = currentSheet.getColumns();
		testData = new String[rows - 1][columns];

		System.out.println("row count " + rows);
		System.out.println("column count " + columns);
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				testData[i - 1][j] = currentSheet.getCell(j, i).getContents();
			}
		}

		return testData;

	}

}

//class ExcelOperation {
//	FileInputStream file;
//	Workbook currentWorkBook;
//	Sheet currentSheet;
//	int rows, columns;
//	String[][] testData;
//
//	ExcelOperation() throws FileNotFoundException {
//		file = new FileInputStream(
//				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/Data_driven_framework_hands_on/TestData.xls");
//	}
//
//	public void readData() throws Exception {
//
//		currentWorkBook = Workbook.getWorkbook(file);
//		currentSheet = currentWorkBook.getSheet("Sheet1");
//		rows = currentSheet.getRows();
//		columns = currentSheet.getColumns();
//		testData = new String[rows - 1][columns];
//
//		for (int i = 1; i <= rows; i++) {
//			for (int j = 0; j < columns - 1; j++) {
//				System.out.println(currentSheet.getCell(j, i).getContents());
//			}
//		}
//
//	}
//
//}
