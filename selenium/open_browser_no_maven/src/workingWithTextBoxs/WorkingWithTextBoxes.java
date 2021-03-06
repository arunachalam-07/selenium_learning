package workingWithTextBoxs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		/*
		 * Main Url:http://testleaf.herokuapp.com/home.html
		 * 
		 * Text box url:http://testleaf.herokuapp.com/pages/Edit.html
		 * */
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		/*
		 * directly interacting with web elements
		 * 
		 * We are going to perform 5 operations
		 * 1.entering text into a text box
		 * 2.appending text into a text already present in keyboard
		 * 3.Retrieving text from text box
		 * 4.clearing text from a text box
		 * 5.Checking whether text box is enabled or not
		 */

////		operation 1: entering text into a text box
//		driver.findElement(By.id("email")).sendKeys("pumamessi@gmail.com"+Keys.TAB);
//		
////		operation 2: appending text into a text box
//		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("Cougar puma"+Keys.TAB);
//
////		operation 3: retrieving a text
//		String txt1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input")).getAttribute("value");
//		System.out.println(txt1);
//		
////		operation 4: clearing text from a textbox
//		
//		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input")).clear();
//		
////		operation 5: checking whether text box is enabled or not.
//	
//		/*
//		 * there are 2 ways for checking whether text box is enabled or not
//		 * 1.by using getAttribute(attribute)
//		 * 2.by using isEnabled();
//		 */
//		
//		String txt2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input")).getAttribute("disabled");
//		System.out.println("Text box is disabled "+txt2);
//		
//		Boolean b=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input")).isEnabled();
//		System.out.println(b);
//		
		
//		for more readable we can store in web element and perform operations in coming hands on
		
//		operation 1: entering text into a text box
		
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("pumamessi@gmail.com"+Keys.TAB);
		
//		operation 2: appending text into a text box
		WebElement appendTextbox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		appendTextbox.sendKeys("Cougar puma"+Keys.TAB);
		
//		operation 3: retrieving a text
		WebElement gettingText=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		String txt3=gettingText.getAttribute("value");
		System.out.println(txt3);
		
		
//		operation 4: clearing text from a text box
		
		WebElement clearTextBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clearTextBox.clear();
		
		
//		operation 5: checking whether text box is enabled or not.
		
		/*
		 * there are 2 ways for checking whether text box is enabled or not
		 * 1.by using getAttribute(attribute)
		 * 2.by using isEnabled();
		 */
		
		WebElement textBoxDisabled=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		Boolean b1=textBoxDisabled.isEnabled();
		System.out.println(b1);
		
		
		driver.quit();
		
		
	}

}
