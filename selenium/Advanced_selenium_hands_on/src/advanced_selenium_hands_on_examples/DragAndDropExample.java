package advanced_selenium_hands_on_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
/*
 * We are going to perform drag and drop operations
 * 
 * Action class is needed when interaction of keyboard and mouse required
 * 
 * clickandHold() will be useful
 * dragAndDrop() will be useful for drag and drop build().perform() is required to complete action
 * 
 * */
		
//		1.drag and drop an element
		
		WebElement dragFrom=driver.findElement(By.id("draggable")); //box we are going to drag
		
		WebElement dragTo=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);//action class is required for drag and drop
		
//		There are 2 ways to drag and drop an element but build().perform() is common
		
//		action.clickAndHold(dragFrom).moveToElement(dragTo).build().perform();
		
		action.dragAndDrop(dragFrom, dragTo).build().perform();

		driver.quit();

}
	
}
