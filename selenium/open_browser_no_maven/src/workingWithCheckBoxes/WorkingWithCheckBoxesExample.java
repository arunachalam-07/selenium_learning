package workingWithCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBoxesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
/*
 * Working With CheckBoxes
 * 
 * opertaions performed
 * 
 * 1.Selecting a check box
 * 
 * 2.confirm whether a check box is selected
 * 
 * 3.deselect a already selected check box
 * 
 * 4.selecting multiple checkboxes
 * 
 */
		
//		1.Selecting a check box
		
		WebElement selectingAcheckBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[1]"));
		
		selectingAcheckBox.click();
		
//		2.confirm whether a checkbox is selected
		
		WebElement chkBoxIsSelected=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
		
		System.out.println("check box is selected "+ chkBoxIsSelected.isSelected());
		
//		3.Deselect a already selected checkbox
		
		WebElement cb1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
		if(cb1.isSelected())cb1.click();
		
//		4.selecting multiple checkboxes
		WebElement cb2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[1]"));
		cb2.click();
		cb2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[2]"));
		cb2.click();
		cb2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[3]"));
		cb2.click();
		cb2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[4]"));
		cb2.click();
		cb2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[5]"));
		cb2.click();

		driver.close();
	}

}
