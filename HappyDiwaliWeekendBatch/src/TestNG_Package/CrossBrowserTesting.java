package TestNG_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testpackage.BaseClass;
public class CrossBrowserTesting extends BaseClass {
	@Test
	@Parameters("browser")
	public void testLogin(String browser) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
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
