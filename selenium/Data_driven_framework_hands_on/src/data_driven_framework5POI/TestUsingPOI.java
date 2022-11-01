package data_driven_framework5POI;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestUsingPOI {
	static List<String>username=new ArrayList<String>();
	static List<String>password=new ArrayList<String>();
	
	public void Login(String username, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement usernameElement = driver.findElement(By.xpath("//div[@id=\"app\"]//input[@name=\"username\"]"));
		WebElement passwordElement = driver.findElement(By.xpath("//div[@id=\"app\"]//input[@name=\"password\"]"));
		WebElement buttonElement = driver.findElement(By.xpath("//div[@id=\"app\"]//button[@type=\"submit\"]"));

		usernameElement.sendKeys(username);
		passwordElement.sendKeys(password);
		buttonElement.click();
		driver.close();
	}

	public void readData() throws Exception {
		
		FileInputStream file = new FileInputStream(
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/Data_driven_framework_hands_on/TestDatausingPOI.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		//iterator for row
		Iterator<Row> row = sheet.iterator();

		while (row.hasNext()) {
			Row currentRow = row.next();

			Iterator<Cell> cell = currentRow.iterator();
				int i=2;
				
				while(cell.hasNext())
				{
				if(i%2==0)
				{
					username.add(cell.next().toString());
				}
				else
				{
					
					password.add(cell.next().toString());
				}
				i++;
				}
				
		}
		for(int i=0;i<username.size();i++)
		{
			Login(username.get(i),password.get(i));
			
			
		}

	}

	@Test
	public void LoginTest() throws Exception
	{
		readData();
		
	}
}
