package testng_handson;

import org.testng.annotations.Test;

public class HandleDependenciesTestcase_4 {
	
	//depending of another test case if parent test case is failed dependent test case wont execute
	
	@Test(priority =1,enabled = false)
	public void primaryHealthCheck()
	{
		System.out.println("Primary health check done");
	}
	
	@Test(priority = 2,dependsOnMethods ="primaryHealthCheck")
	public void secondaryHealthCheck()
	{
		System.out.println("Secondary health check done");
	}
	
	@Test(priority=3,dependsOnMethods = "secondaryHealthCheck")
	public void engineStart()
	{
		System.out.println("Car Started");
	}

}
