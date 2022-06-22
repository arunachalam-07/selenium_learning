package advanced_selenium_hands_on_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSelectablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		
/*
 * for selectables we need Action class to select multiple values
 */

	List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		Actions action = new Actions(driver);
		
//		now pressing ctrl button
		
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).build().perform();
		action.keyDown(Keys.CONTROL).click(selectable.get(1)).build().perform();
		action.keyDown(Keys.CONTROL).click(selectable.get(2)).build().perform();
		
		
//		we can use clickandHold also
		action.clickAndHold(selectable.get(4));
		action.clickAndHold(selectable.get(5));
		action.build().perform();
		
		driver.quit();
	}

}
