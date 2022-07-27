package advanced_selenium_hands_on_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
//		http://www.leafground.com/pages/autoComplete.html
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
/*
 * operation going to perform
 * 
 * interacting with auto complete feature
 * 
 */
		
		WebElement autoCompletionBox=driver.findElement(By.id("tags"));
//		sending keys to see auto complete option
		autoCompletionBox.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> listOfOptions=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		for (WebElement webElement : listOfOptions) {
			if(webElement.getText().equalsIgnoreCase("selenium"))
			{
				webElement.click();
				break;
			}
		}
		
		driver.quit();

	}

}
