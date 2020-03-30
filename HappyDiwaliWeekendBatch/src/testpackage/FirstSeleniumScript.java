package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException
	{
		//set the path of chromedriver.exe
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//Launch Chrome Browser// 
		WebDriver driver = new ChromeDriver(); 
		//driver = new FirefoxDriver();
		//Enter URL
		driver.get("http://www.google.com");
		//Print the title of page.
		String actualTitle = driver.getTitle();
		System.out.println("Title is : "+ actualTitle);
		//Print the URL of Page.
		System.out.println("URL is "+driver.getCurrentUrl());
		Thread.sleep(5000);	 
		//close the browser.
		driver.close();
	}
}