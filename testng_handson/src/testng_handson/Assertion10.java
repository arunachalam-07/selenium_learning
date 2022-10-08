package testng_handson;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assertion10 {

	@Test
	@Parameters("Name")
	public void printName(String name)
	{
		Assert.assertEquals("messi cougar", name);
		System.out.println(name);
		
	}
}
