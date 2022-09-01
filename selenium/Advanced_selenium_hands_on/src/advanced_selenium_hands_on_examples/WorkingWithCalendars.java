package advanced_selenium_hands_on_examples;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationClassCalendar2 calendar2 = new ApplicationClassCalendar2();

		calendar2.movingSpecificMonth("September", 2023);
		calendar2.pickADate();
		calendar2.seleniumClose();
	}

}

class ApplicationClassCalendar2 {

	WebDriver driver;
	WebElement previous, next, currentDate, monthAndYear;

	public ApplicationClassCalendar2() {
		System.setProperty("webdriver.chrome.driver",
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		previous = driver.findElement(By.xpath("//button[normalize-space()='Previous']"));
		next = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		currentDate = driver.findElement(By.xpath("//button[normalize-space()='Current Date']"));
		monthAndYear = driver.findElement(By.xpath("//h2"));
	}

	void previous() {
		previous.click();
	}

	void forward() {
		next.click();
	}

	void current() {
		currentDate.click();
	}

	void movingSpecificMonth(String month, int year) {
		String temp = monthAndYear.getText().trim();
		int currentYear = Integer.parseInt(temp.substring(temp.length() - 4));
		String currentMonth = temp.substring(0, temp.length() - 5);

		while (!(month.equalsIgnoreCase(currentMonth) && currentYear == year)) {
			if (currentYear <= year) {
				forward();
			} else if (currentYear >= year) {
				previous();

			}
			monthAndYear = driver.findElement(By.xpath("//h2"));
			temp = monthAndYear.getText().trim();
//			System.out.println(temp);
//			System.out.println(temp.substring(temp.length() - 4));
//			System.out.println(temp.substring(0, temp.length() - 5));
			currentYear = Integer.parseInt(temp.substring(temp.length() - 4));
			currentMonth = temp.substring(0, temp.length() - 5);

		}
	}

	void pickADate()
	{
		
//		//td[@data-date='2022-09-01']
		
		WebElement pickDate=driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[6]"));
		pickDate.click();
		
	}
	
	void seleniumClose() {
		driver.close();
	}
}