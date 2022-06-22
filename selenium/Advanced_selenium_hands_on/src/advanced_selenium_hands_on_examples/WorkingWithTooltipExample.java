package advanced_selenium_hands_on_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTooltipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/tooltip.html");
		
/*
 * When a hover an element a text will appear  that is tool tip
 * 
 * 
 */
		WebElement toolTip=driver.findElement(By.id("age"));
		
		System.out.println(toolTip.getAttribute("title"));
		
		driver.quit();
	}

}
