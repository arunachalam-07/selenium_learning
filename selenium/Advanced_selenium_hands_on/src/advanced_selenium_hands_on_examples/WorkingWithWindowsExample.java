package advanced_selenium_hands_on_examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://testleaf.herokuapp.com/pages/Window.html");

		/*
		 * Working With Windows
		 * 
		 * important methods 1.getWindowHandle()->return a string (detail of current
		 * window opened by driver) 2.getWindowHandles()-> return a set of
		 * string(details of windows opened by driver) 3.switchTo().window(args)->used
		 * to switch control from driver to windows
		 * 
		 * operations performed
		 * 
		 * 1.opening a window and and clicking in new window 2.getting number of windows
		 * opened 3.closing child windows and without closing parent windows
		 * 
		 */

//		storing detail of parent window using getHandle()

		String parentWindow = driver.getWindowHandle();

//		1.opening a window and clicking in new window

		WebElement openingAWindow = driver.findElement(By.id("home"));
		openingAWindow.click();// it will open a new window

		Set<String> activeWindows = driver.getWindowHandles();// getting details of active windows opened by driver

		for (String window : activeWindows) {
			driver.switchTo().window(window);// switching control to child window
		}

		WebElement childWindowTextBox = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		childWindowTextBox.click();

		childWindowTextBox = driver.findElement(By.id("email"));
		childWindowTextBox.sendKeys("cougarMessi@ru.com");

		driver.close();// closing child window
		driver.switchTo().window(parentWindow);// switching control back to parent window

//		2.getting number of current windows

		openingAWindow = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		openingAWindow.click();

		activeWindows = driver.getWindowHandles();

		int windowCount = activeWindows.size();

		System.out.println("windows active and open are " + " " + windowCount);

		for (String window : activeWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);// switching control to child window
				driver.close();// closing child windows
			}
		}

		driver.switchTo().window(parentWindow);

//			3.closing child windows and without closing parent windows

		WebElement openingAWindow2 = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		openingAWindow2.click();

		activeWindows = driver.getWindowHandles();

		for (String window1 : activeWindows) {
			if (!window1.equals(parentWindow)) {
				driver.switchTo().window(window1);// switching control to child window
				driver.close();// closing child windows
			}

		}
		driver.switchTo().window(parentWindow);
		
//		3.closing child windows and without closing parent windows
	   openingAWindow2 = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		openingAWindow2.click();
		activeWindows = driver.getWindowHandles();

		for (String window1 : activeWindows) {
			if (!window1.equals(parentWindow)) {
				driver.switchTo().window(window1);// switching control to child window
				driver.close();// closing child windows
			}

		}
		
		driver.quit();
		
		
		

	}

}
