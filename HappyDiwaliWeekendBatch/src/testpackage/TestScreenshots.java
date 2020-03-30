package testpackage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
public class TestScreenshots extends BaseClass {

	public static void main(String[] args) throws IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcfile);
		File dstfile = new File("./Screenshots/facebook1.png");
		System.out.println(dstfile);
		Files.copy(srcfile, dstfile);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();		
	}
}
