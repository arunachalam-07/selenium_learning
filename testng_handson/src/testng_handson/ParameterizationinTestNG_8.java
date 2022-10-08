package testng_handson;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationinTestNG_8 {

	/*
	 * Passing parameter from TestNG xml file to java program
	 */

	@Test
	@Parameters("Name")
	public void parameter1(String name) {
		System.out.println(name);
	}

}
