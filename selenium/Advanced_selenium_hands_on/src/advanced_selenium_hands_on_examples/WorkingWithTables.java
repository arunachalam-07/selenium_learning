package advanced_selenium_hands_on_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Operations going to perform
		 * 
		 * Interacting with tables
		 * 
		 * 1.Get the count of number of columns
		 * 
		 * 2.Get the count of number of rows
		 * 
		 * 3.Get the progress value of 'Learn to interact with Elements'
		 * 
		 * 4.Check the vital task for the least completed progress.
		 */

		ApplicationClassWorkingWithtables driver = new ApplicationClassWorkingWithtables();
		driver.selenium();
		driver.getNumberOfColumns();
		driver.getNumberOfRows();
		driver.getProgressValue();
		driver.vitalTaskForLeastProgress();
		driver.closeSelenium();
	}

}

class ApplicationClassWorkingWithtables {
	WebDriver driver;

	public void selenium() {
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://testleaf.herokuapp.com/pages/table.html");
	}

//	Get the count of number of columns

	public void getNumberOfColumns() {
		List<WebElement> numberOfColumns = driver.findElements(By.tagName("th"));

		System.out.println("No of columns present " + numberOfColumns.size());
	}

// Get the count of number of rows

	public void getNumberOfRows() {
		List<WebElement> numberOfRows = driver.findElements(By.tagName("tr"));

		System.out.println("No of rows present " + numberOfRows.size());
	}

//Get the progress value of 'Learn to interact with Elements'

	public void getProgressValue() {
		WebElement interactWithElementProgress = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		System.out.println("Learn to interact with Elements "+interactWithElementProgress.getText());
	}
//	Check the vital task for the least completed progress.

	public void vitalTaskForLeastProgress() {
		int rowNum = 2;
		String Xpath;
		List<Integer> value = new ArrayList();
		WebElement progressValue;
		for (int i = 0; i < 3; i++) {
			Xpath = "//tbody//tr[" + rowNum + "]//td[2]";
			progressValue = driver.findElement(By.xpath(Xpath));
			rowNum++;
			value.add(new Integer(progressValue.getText().replace('%', ' ').trim()));
		}

		Collections.sort(value);
		rowNum = 2;
		for (int i = 0; i < 3; i++) {
			int tempValue;
			Xpath = "//tbody//tr[" + rowNum + "]//td[2]";
			progressValue = driver.findElement(By.xpath(Xpath));
			
			tempValue = (new Integer(progressValue.getText().replace('%', ' ').trim()));
			if (tempValue == value.get(0)) {
				String tempXpath = "//tbody//tr[" + rowNum + "]//td[2]//following::td[1]//input";
				progressValue = driver.findElement(By.xpath(tempXpath));
				System.out.println("Vital task is completed " + progressValue.isSelected());
			}
			rowNum++;

		}

	}

//close driver
	public void closeSelenium() {
		driver.quit();
	}

}
