package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintB {
	@Test
	public static void printA(){
		Reporter.log("BBB...", true);
	}
}
