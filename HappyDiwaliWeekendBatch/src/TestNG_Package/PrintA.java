package TestNG_Package;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintA {

	@Test (priority=2,dependsOnMethods="createUser")
	public static void deleteUser() {
		Reporter.log("deleteUser", true);
	}

	@Test (priority=1, invocationCount=1)
	public static void createUser() {

		Reporter.log("createUser", true);

		Assert.fail("intentionally failing createUser method...");
	}

	@Test(priority=1,invocationCount=2,enabled=true)
	public static void editUser() {
		Reporter.log("edituser", true);

	}
}



















/*package TestNG_Package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintA {
	@Test
	public static void createUsername() {

		System.out.println("Print only in console....");

	Reporter.log("print in html report");

	Reporter.log("Print both on console and html reort", true);

	}
}
 */