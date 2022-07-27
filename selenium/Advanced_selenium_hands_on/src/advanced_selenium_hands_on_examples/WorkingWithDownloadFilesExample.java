package advanced_selenium_hands_on_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDownloadFilesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement clickLink= driver.findElement(By.partialLinkText("Download Excel"));
		
		clickLink.click();
		
		clickLink=driver.findElement(By.partialLinkText("Download PDF"));
		
		clickLink.click();
		
		clickLink=driver.findElement(By.partialLinkText("Download Text"));
		
		clickLink.click();
		
		driver.quit();

	}

}
