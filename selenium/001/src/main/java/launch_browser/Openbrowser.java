package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();

	}

}
