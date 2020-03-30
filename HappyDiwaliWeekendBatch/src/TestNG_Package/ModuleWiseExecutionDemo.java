package TestNG_Package;
import org.testng.annotations.Test;
public class ModuleWiseExecutionDemo {
	@Test(groups={"user","smoke"})
	public void createUser()
	{
		System.out.println("CreateUser....");
	}
	@Test(groups= {"user","regression"})
	public void editUser() {
		System.out.println("edituser....");
	}	
	@Test(groups= {"user","regression"})
	public void deleteUser() {
		System.out.println("deleteuser....");
	}	
	@Test(groups= {"product","smoke"})
	public void createproduct() {
		System.out.println("CreateProduct....");
	}	
	@Test(groups= {"product","regression"})
	public void editproduct() {
		System.out.println("editProduct....");
	}
	@Test(groups= {"product","regression"})
	public void deleteproduct() {
		System.out.println("deleteProduct....");
	}
}