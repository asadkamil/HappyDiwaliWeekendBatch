package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntegrateAutomation {

	public static void main(String[] args) throws InterruptedException {
		//set the path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://integratestage.myvrx.com/#/auth/login");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement unTB = driver.findElement(By.xpath("//*[@ng-model='vm.username']"));
		unTB.sendKeys("avinash.gupta@emids.com");
		WebElement pwdTB = driver.findElement(By.xpath("//*[@ng-model='vm.password']"));
		pwdTB.sendKeys("Emids@007");
		Thread.sleep(2000);
		driver.close();

	}
}
