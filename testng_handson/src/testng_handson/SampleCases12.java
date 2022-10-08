package testng_handson;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleCases12 {
	@Test
	public void actualTest()
	{
		System.out.println("Actual Test");
	}
	
	@Test()
	public void skipCase()
	{
		System.out.println("skipped case");
		throw new SkipException("Forcely skipping the sampleTest4");
	}
	
	 @Test  //Failing Test
	 public void failCase()
	 {
		 Assert.assertTrue(false);
	 System.out.println("Forcely Failed Test Method");
	 
	 
	 }
}
