package datadrivenintro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CorrectUsernameWrongPassword {

	@Test
	public void Login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement usernameElement = driver.findElement(By.xpath("//div[@id=\"app\"]//input[@name=\"username\"]"));
		WebElement passwordElement = driver.findElement(By.xpath("//div[@id=\"app\"]//input[@name=\"password\"]"));
		WebElement buttonElement = driver
				.findElement(By.xpath("//div[@id=\"app\"]//button[@type=\"submit\"]"));

		usernameElement.sendKeys("Admin");
		passwordElement.sendKeys("admin");
		buttonElement.click();
		driver.close();
	}

}
