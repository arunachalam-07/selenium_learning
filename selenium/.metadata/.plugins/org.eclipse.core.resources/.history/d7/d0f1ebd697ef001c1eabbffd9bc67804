package workingWithAlertsExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
/*
 * 		Working with alerts
 * 		
 * 		operations performed
 * 
 * 		1.Normal Alert
 * 		2.Confirm Alert
 * 		3.Prompt Alert
 */

//		1.Normal Alert- alert box have only ok button
		
		WebElement normalAlert=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		
		normalAlert.click();
//		Switching control from driver to alert
		Alert normalAlertOperation=driver.switchTo().alert();
//		accepting alert by pressing ok
		normalAlertOperation.accept();
		
//		2.confirm Alert-alert box have two buttons ok and cancel
		
		WebElement confirmAlert=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		confirmAlert.click();
		Alert confirmAlertOperation=driver.switchTo().alert();
//		pressing cancelling option
		confirmAlertOperation.dismiss();
		
//		3.prompt Alert- alert box have a text box
		
		WebElement promptAlert=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		promptAlert.click();
		Alert promptAlertOperation=driver.switchTo().alert();
		promptAlertOperation.sendKeys("cougar");//because alert have control
		promptAlertOperation.accept();
		
		driver.close();
		
		
	}

}
