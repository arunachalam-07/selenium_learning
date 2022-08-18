package advanced_selenium_hands_on_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
//		navigate().to() is another way of going to webpage we can move backward and forward if we use navigate() but we can't go forward and backward in get()
		
		/*
		 * Operations going to perform 
		 * 1.going to dashboard
		 * 2.Find destination without going to that link
		 * 3.Verifying a link is broken
		 * 4.duplicate link
		 * 5.count links
		 * 6.count layout links
		 */
		
//		1.going to dashboard
		
		goToDashBoard(driver);
		
//		2.find destination without going to that link
		findDestination(driver);
		

//		3.verifying link is broken
		findBrokenLink(driver);

//		4.duplicate Link
		
		duplicateLink(driver);
		
//		5.number of link in page
		numberOfLinks(driver);
		
//		6 number of links in layout-main-content
		numberOfLinksInSpecificArea(driver);
		
		driver.quit();
	}
//	1.going to dashboard
	public static void goToDashBoard(WebDriver driver)
	{
		WebElement goingToDashboard=driver.findElement(By.partialLinkText("Dashboard"));
		
		goingToDashboard.click();
		driver.navigate().back();
	}
// 2.finding destination
	public static void findDestination(WebDriver driver)
	{
		WebElement findDestini=driver.findElement(By.partialLinkText("URL"));
		String destination=findDestini.getAttribute("href");
		
		System.out.println("destination is "+destination);
	}
	
//	3.finding Broken link
	
	public static void findBrokenLink(WebDriver driver)
	{
		WebElement brokenLink=driver.findElement(By.partialLinkText("Broken"));
		brokenLink.click();
		boolean linkPresent=driver.getTitle().contains("404");
		if(linkPresent)
		{
			System.out.println("link broken");
		}
		
		driver.navigate().back();
	}
	
//	4.duplicate link
	
	public static void duplicateLink(WebDriver driver)
	{
		
		goToDashBoard(driver);
		
//		stale reference execption is not thrown because we are finding the link again 
	}
	
//	5. number of link available in page
	
	public static void numberOfLinks(WebDriver driver)
	{
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		List<WebElement> listofLinks=driver.findElements(By.tagName("a"));
		System.out.println(listofLinks.size());
		
	}
	
//	6.number of link available within specific part
	public static void numberOfLinksInSpecificArea(WebDriver driver)
	{
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		List<WebElement> listOfLinks=driver.findElements(By.xpath("//div[@class='layout-main-content']//a"));
		
		System.out.println("no of links in layout-main-content class "+listOfLinks.size());
	}
}
