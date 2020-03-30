package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static {
		//set the path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

	}
	//Launch the browser
	public static WebDriver driver = new ChromeDriver();
}
