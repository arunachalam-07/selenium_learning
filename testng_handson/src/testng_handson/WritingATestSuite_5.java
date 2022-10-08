package testng_handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WritingATestSuite_5 {

	/*
	 * To avoid multiple reworking of same work( like opening browser etc...) multiples time  we are using test suite 
	 */
//	WritingATestSuite_5() {
//		System.setProperty("webdriver.chrome.driver",
//				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
//
//	}
//
//	@Test
//	public void openGoogle() {
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.close();
//	}
//
//	@Test
//	public void openBing() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bing.com");
//		driver.close();
//	}
//
//	@Test
//	public void openYahoo() {
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.yahoo.com");
//		driver.close();
//	}
	
//	above methods make browser opens and closed 3 times it will consume more time so we are some common value outside of methods
	
	WebDriver driver;
	
	@BeforeSuite // done before Test
	public void initateBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
			"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		driver=new ChromeDriver();
	}
	
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openBing()
	{
		driver.get("https://www.bing.com");
	}
	@Test
	public void openYahoo()
	{
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite()
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
