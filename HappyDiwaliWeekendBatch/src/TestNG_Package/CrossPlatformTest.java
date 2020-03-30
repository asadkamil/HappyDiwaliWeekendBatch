package TestNG_Package;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.141.59.jar


import testpackage.BaseClass;

public class CrossPlatformTest extends BaseClass {
	@Test
	public void runInMultiOSandMultiBrowsers() throws MalformedURLException, InterruptedException {
		URL whichSystem = new URL("https://localhost:4444/wd/hub");
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(whichSystem,whichBrowser);
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement UnTB = driver.findElement(By.id("username"));
		for (int i=1;i<=5;i++)
		{
			UnTB.sendKeys("admin"+i);
			Thread.sleep(2000);
			UnTB.clear();
		}
		driver.close();
	}
}
