package advanced_selenium_hands_on_examples;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadingFileExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");

//		operations going to perform is uploading a file
		
		WebElement uploadFileButton=driver.findElement(By.name("filename"));
//		we can use sendKeys to upload file 
//		uploadFileButton.sendKeys("/home/arunachalam/Downloads/2013.pdf");
		
/*
 * facing invalid argument issue while clicking upload button so we are going to use action class
 * 
 */
		Actions action=new Actions(driver);
		action.moveToElement(uploadFileButton).click().build().perform();
//		
////		using clipboard for storing file path
//		StringSelection path=new StringSelection("/home/arunachalam/Downloads/2013.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
//		now using robot class to upload file
		
//		can't select exact file 
		Robot robot=new Robot();
		File fileLocation=new File("/home/arunachalam/");
		File[] files=fileLocation.listFiles();
		for(File file:files)
		{
			if((file.getName().equalsIgnoreCase("kid.txt")))
			{
				
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				break;
			
			
			}
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		
	}

}
