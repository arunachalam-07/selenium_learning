package testng_handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTestCaseExecution_9 {



	@Test()
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

	@Test()
	public void openBing() {
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	}

	@Test()
	public void openDuckGO() {
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.quit();
	}
	
	

}
