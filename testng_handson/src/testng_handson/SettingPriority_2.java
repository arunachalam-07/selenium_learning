package testng_handson;

import org.testng.annotations.Test;

public class SettingPriority_2 {
	
	DriveACar car=new  DriveACar();
	
}
/*
 * TestNg calls method based on alphabetical orders so we are using priority in Test annotation to maintain order of execution
 */
class DriveACar
{
	@Test(priority = 0)
	
	void healthCheck()
	{
		System.out.println("Car is in good condition and able to drive");
	}
	
	@Test(priority = 1)
	void startCar()
	{
		System.out.println("Car Started");
	}
	
	@Test(priority =2)
	void put1stGear()
	{
		System.out.println("car in 1st gear");
	}
	
	@Test(priority=3)
	void put2ndGear()
	{
		System.out.println("car in 2nd gear");
	}
	
	@Test(priority=4)
	
	void put3rdGear()
	{
		System.out.println("car in 3rd gear");
	}
	
	@Test(priority =1)
	void putNetural()
	{
		System.out.println("car in neutral");
	}
}
