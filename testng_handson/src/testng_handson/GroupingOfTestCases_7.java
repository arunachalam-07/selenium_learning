package testng_handson;

import org.testng.annotations.Test;

public class GroupingOfTestCases_7 {

	/*
	 * groruping of test cases is possible by adding groups parameter in test annotation
	 */
	
	
	/*
	 * consider vivo , apple , moto , lenovo.
	 * we need to run only apple and moto testcases and need not to run other testcases
	 * 
	 * so we can group test cases and include required groups in xml file
	 */
	
	@Test(groups= {"moto"})
	public void moto1()
	{
		System.out.println("moto phone 1 passed ");
	}
	
	@Test(groups= {"moto"})
	public void moto2()
	{
		System.out.println("moto phone 2 passed");
	}
	
	@Test(groups= {"apple"})
	public void apple1()
	{
		System.out.println("I phone 1 passed");
	}
	
	@Test(groups= {"apple"})
	public void apple2()
	{
		System.out.println("I phone 2 passed");
	}
	
	@Test(groups= {"vivo"})
	public void vivo1()
	{
		System.out.println("Vivo 1 passed");
	}
	
	@Test(groups= {"vivo"})
	public void vivo2()
	{
		System.out.println("Vivo 2 passed");
	}
	
	
}
