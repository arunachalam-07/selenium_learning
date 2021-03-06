package workingwithDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
/*		Working with drop downs
 * 
 * 		Operations going to perform are
 * 
 * 		1.select a drop down value using index
 * 	
 * 		2.select a drop down value using text
 * 
 * 		3.select a drop down value using option value in html
 * 
 * 		4.Get the number of drop down values
 * 
 * 		5.select a drop down value using sendKeys()
 * 
 * 		6.multi select value in a drop down
 * 
 */

//		1.Select a drop down value 
		WebElement selectingValueByIndex=driver.findElement(By.id("dropdown1"));
		
//		Using Select class for selecting values in a drop down
		Select select=new Select(selectingValueByIndex);
		select.selectByIndex(2);
		
		
	
//		2.select a drop down value using text
		
		WebElement selectingValueByText=driver.findElement(By.name("dropdown2"));
		select=new Select(selectingValueByText);
		select.selectByVisibleText("Selenium");
		
		
// 		3.select a drop down value using option value in html
		WebElement selectingValueByOption=driver.findElement(By.id("dropdown3"));
		select=new Select(selectingValueByOption);
		select.selectByValue("4");
		
		
//		4.Get the number of drop down values
		WebElement lengthOfDropDown=driver.findElement(By.className("dropdown"));
		select=new Select(lengthOfDropDown);
		List<WebElement> listOfValues=select.getOptions();
		System.out.println("number of values available in drop down"+" "+listOfValues.size());
		
//		5.select a drop down value using sendKeys()
		WebElement choosingValueBySendkey=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		choosingValueBySendkey.sendKeys("Selenium");
		
//		6.multi select value in a drop down
		
		WebElement multiValueInDropDown=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		select=new Select(multiValueInDropDown);
		select.selectByValue("2");
		select.selectByVisibleText("UFT/QTP");
		
		driver.close();
	}

}
