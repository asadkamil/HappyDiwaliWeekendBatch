package TestNG_Package;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataParameterizationUsingDataProvider {
	//create ur own databank
	@DataProvider
	public Object [][] userCredentials(){
		Object data[][] = new Object[2][2]; //Declaration
		//initialize the array--- insert the data into the array
		data[0][0]="admin1";
		data[0][1]="manager1";
		data[1][0]="admin2";
		data[1][1]="manager2";		
		return data;
	}
	@Test(dataProvider="userCredentials")
	public void testLogin(String un, String pwd, String confirmPwd) {
		System.out.println(un+" : "+pwd);
	}

}
