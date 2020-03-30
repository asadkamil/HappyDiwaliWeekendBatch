package TestNG_Package;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossPlatformTesting {
	
	@Test @Parameters({"node","browser"})
	public void runInMultiOSanfMultiBrowsers(String node, String browser) throws MalformedURLException, InterruptedException
	{
		System.out.println(browser);
		URL whichSystem = new URL(node);
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);		
		WebDriver driver = new RemoteWebDriver(whichSystem,whichBrowser);
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		WebElement unTB = driver.findElement(By.id("username"));
		for (int i = 1; i<=5; i++) {
			unTB.sendKeys("admin-->>"+1);
			Thread.sleep(2000);
			unTB.clear();
		}
		driver.quit();		
	}
}
