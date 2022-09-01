package advanced_selenium_hands_on_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingWithCalendars2Application calendars2Application=new WorkingWithCalendars2Application();
		calendars2Application.pickaDate();
		calendars2Application.closeDriver();

	}
	
	

}


class WorkingWithCalendars2Application
{
	WebDriver driver;
	WorkingWithCalendars2Application()
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		
	}
	
	void closeDriver()
	{
		driver.close();
	}
	
	void pickaDate()
	{
		WebElement dateInput=driver.findElement(By.id("datepicker"));
		
		dateInput.click();
		
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
	}
}
