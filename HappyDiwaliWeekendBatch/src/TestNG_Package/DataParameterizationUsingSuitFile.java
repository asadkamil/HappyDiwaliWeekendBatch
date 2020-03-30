package TestNG_Package;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterizationUsingSuitFile {
	@Parameters({"city","area"})
	@Test
	public void printDataFromSuiteFile(String city, String area)
	{
		System.out.println(city + " : "+ area);
	}

}
