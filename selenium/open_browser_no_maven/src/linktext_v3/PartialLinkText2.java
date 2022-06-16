package linktext_v3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.findElement(By.partialLinkText("Go to Home")).click();

	}

}
