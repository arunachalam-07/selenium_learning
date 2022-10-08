package testng_handson;

import org.testng.annotations.Test;

public class SkippingATestcase_3 {
	
	//for skipping a test case kindly use enabled=false in @ test annotation
	
	@Test(priority=0)
	public void healthCheck()
	{
		System.out.println("car in good position");
	}
	
	@Test(priority=1)
	public void startEngine()
	{
		System.out.println("Car started");
	}
	
	@Test(priority = 2)
	
	public void put1stGear()
	{
		System.out.println("Car in 1st Gear");
	}
	
	@Test(priority=3)
	public void put2ndGear()
	{
		System.out.println("car in 2nd Gear");
	}
	
	@Test(priority=4,enabled = false)
	public void enableMusic()
	{
		System.out.println("music system turned on");
	}
	
	@Test()
	public void secondaryHealthCheck()
	{
		System.out.println("secondary health check");
	}
	
	
}
