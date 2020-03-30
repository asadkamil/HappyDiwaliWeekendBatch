package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// set the path of chromedriver.exe
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// Launch Chrome Browser// 
		WebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		// Enter URL
		driver.get("https://demo.actitime.com/login.do");
		// Print the title of page.
		String actTitle = driver.getTitle();
		System.out.println("The actual tile of page is:" +actTitle);
		//System.out.println(driver.getTitle());   another way to print the actual title.
		// Print the URL of Page.
		System.out.println("URL of the page is " + driver.getCurrentUrl());
		WebElement unTB = driver.findElement(By.id("username"));
		boolean displayed = unTB.isDisplayed();   //CTRL 1 ENTER
		if (displayed)
		{
			System.out.println("USERNAME tab is displayed..");
			//verify if UN tab is enabled or not?
			boolean enabled = unTB.isEnabled();
			if (enabled)
			{
				System.out.println("Username tab is enabled..");
				Thread.sleep(2000);
				//Enter "admin" in UN tab.
				unTB.sendKeys("admin");
				Thread.sleep(2000);	
				//unTB.clear();
				Thread.sleep(2000);
			}
			else
			{
				System.out.println("Username is disabled");
			}
		}
		else 	
		{
			System.out.println("username tb is not displayed");
		}
		//Enter "manager" in pwd textbox.	
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		boolean Pwddisplayed = pwdTB.isDisplayed();
		if (Pwddisplayed) {
			boolean enabled = pwdTB.isEnabled();
			System.out.println("Password tab is displayed and enabled");
		}
		else
		{
			System.out.println("Password tab is not displayed");
		}
		pwdTB.sendKeys("manager");
		Thread.sleep(2000);
		//click on login button.
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(20000);
		// close the browser.
		driver.close();

	}
}