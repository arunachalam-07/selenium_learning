package workingWithRadiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
/*
 * Working with radio buttons
 * 
 * 1.clicking a radio button
 * 
 * 2.checking which radio buttons i selected
 * 
 */
		
//		1.clicking a radio button
		
		WebElement radioButton1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		
		radioButton1.click();
		
		
//		2.checking which radio button is selected
		WebElement checkingButton1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]"));
		WebElement checkingButton2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
		boolean b1=checkingButton1.isSelected();
		boolean b2=checkingButton2.isSelected();
		
		System.out.println("Unchecked radio button is selected "+b1);
		System.out.println("Checked radio button is selected"+b2);
		
		
		
	}

}
