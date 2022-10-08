package testng_handson;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WritingATestSuiteInAXML_6 {
	WebDriver driver;
	
	@BeforeSuite
	public void checkCarHealth()
	{
		System.out.println("checking car Health - tested ok");
	}
	@BeforeTest()
	public void basicCheck()
	{
		System.out.println("Basic check passed ");
	}
	
	@Test(priority = 0)
	public void releaseHandBreak()
	{
		System.out.println("hands on break released");
	}
	
	@Test(priority=1)
	public void startCar()
	{
		System.out.println("car started");
	}
	
	@Test(priority=2,dependsOnMethods = "startCar")
	public void putDriveMode()
	{
		System.out.println("Car in drive mode");
	}
	@Test
	public void putNetural()
	{
		System.out.println("Car in netural mode");
	}
	@Test 
	public void putReverse()
	{
		System.out.println("Car in Reverse mode");
	}
	
	@AfterTest()
	public void applyHandBreak()
	{
		System.out.println("Hand Break applied");
		
	}
	@AfterSuite()
	public void turnOffCar()
	{
		System.out.println("car engine off");
	}
}
