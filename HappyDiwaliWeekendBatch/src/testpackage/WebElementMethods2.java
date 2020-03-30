package testpackage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.io.Files;

public class WebElementMethods2 {
	public static void main(String[] args) throws IOException {
		//set the path
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://integratedev.myvrx.com/#/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcfile);
		File Dstfile = new File("./Screenshots/integratestage4.png");
		Files.copy(srcfile, Dstfile);
		driver.close(); 
	}
}
