package testpackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameDemo extends BaseClass{

	@Test
	public static void frameHandle() {

		driver.get("file:///C:/Users/Er.%20Asad%20Kamil/Desktop/frame1.html");
		driver.findElement(By.id("t1"));
		
		
		
		driver.quit();
	}

}
