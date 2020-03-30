package TestNG_Package.TestNG_Package;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class DataParameterizationUsingSuitFileTest {
	@Parameters({"city","area"})
	@Test
	public void pintdata(String city,String area) {
		System.out.println(city+":"+area);  
	}
}
