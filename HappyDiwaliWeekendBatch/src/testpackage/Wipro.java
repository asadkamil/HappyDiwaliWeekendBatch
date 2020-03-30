package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/?gws_rd=ssl");
driver.get("https://www.facebook.com/");
driver.get("https://www.wipro.com/");
driver.get("https://www.actitime.com/");
driver.close();
	}
}
