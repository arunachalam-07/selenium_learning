package advanced_selenium_hands_on_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//http://www.leafground.com/pages/Image.html

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Image.html");
		
/*
 * working with images 
 * operation going to perform 
 * 1.clicking a image
 * 2.finding a whether image is broken or not
 */
		
//		1.clicking  a image opeation
		
		WebElement firstImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		firstImage.click();
		
//		moving backing to image page
		
		WebElement backToImage=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img"));
		backToImage.click();
		
//		2.finding a whether image is broken or not
		
		WebElement isImageBroken=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		if(isImageBroken.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken");
		}
		
		driver.quit();
	}

}
