package workingWithButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

//		buttons url http://testleaf.herokuapp.com/pages/Button.html
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		/*
		 * 4 operations we are going to perform 1.finding position of button x,y
		 * co-ordinates 2.finding color of button 3.finding height and width of a button
		 * 4.clicking a button
		 */

//		1.finding position of button x,y co-ordinates

		WebElement positionOfButton = driver.findElement(By.id("position"));

		Point pointer = positionOfButton.getLocation();

		int x = pointer.getX();

		int y = pointer.getY();

		System.out.println("x,y Co-ordinates of button is " + " " + x + " " + y);

//		2.finding color of button

		WebElement colorOfButton = driver.findElement(By.id("color"));

		String color = colorOfButton.getCssValue("background-color");

		System.out.println("color of button is " + color);
		
//		3.finding height and width of a button
		
		WebElement heightWidthButton=driver.findElement(By.id("size"));
		
		Dimension dimension=heightWidthButton.getSize();
		
		int height=dimension.getHeight();
		
		int width=dimension.getWidth();
		
		System.out.println("Height of a button is"+" "+height+" "+"Width of a button"+" "+width);
		
//		4.clicking a button
		
		WebElement clickButton=driver.findElement(By.id("home"));
		
		clickButton.click();

		driver.quit();
	}

}
