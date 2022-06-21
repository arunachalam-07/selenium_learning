package advanced_selenium_hands_on_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIframesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
//		url:http://testleaf.herokuapp.com/pages/frame.html
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
/*
 * Working with Frames 
 * 
 * frames are html code that are embedded in html 
 * 
 * frames are like html inside an html
 * 
 * need to switch control from driver to frame and vice versa
 * 
 * first we need to find frame then we need to switch control and then operations can be performed
 * 
 * important methods are
 * -----------------------
 * 
 * 1.driver.switchTo().frame(arg); -> switching comtrol to frame
 * 2.driver.switchTO().defaultContent(); -> switching control to driver
 * 
 * Operations going to perform
 * 
 * 1.clicking a button in a frame
 * 
 * 2.clicking a button in a nested frame
 * 
 * 3.finding number of frames
 * 
 */
		
		
//		1.clicking a button in a frame
		
		WebElement iFrame1=driver.findElement(By.xpath("//*[@id=\"wrapframe\"]"));
		
//		switching control to frame
		

		driver.switchTo().frame(0);
//		here 0 indicates index i.e first frame
		
		WebElement iFrameButton=driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		String beforeClick=iFrameButton.getText();
		
		System.out.println("Before clicking-> "+beforeClick);
		iFrameButton.click();
		String afterClick=iFrameButton.getText();
		System.out.println("After clicking ->"+afterClick);
		
//		switching control back to driver
		
		driver.switchTo().defaultContent();
		
//		2.nested frame
		
//		for nested frame we need to switch control twice
		
		WebElement iFrameButton1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/iframe"));
		
		driver.switchTo().frame(1);// switching control to main frame
		
		driver.switchTo().frame("frame2");
		
		WebElement button1=driver.findElement(By.id("Click1"));
		
		beforeClick=button1.getText();
		
		button1.click();
		
		afterClick=button1.getText();
		
//		moving control back to driver
		driver.switchTo().defaultContent(); 
		
//		3.getting number of  frames 
		
		List<WebElement>listOfFrames=driver.findElements(By.tagName("iframe"));
		
		System.out.println("No of frames available are "+ listOfFrames.size());
		
		driver.quit();
	}

}
