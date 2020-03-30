package testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class RobotClassDemo extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		//enter admin using robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
//      driver.findElement(By.xpath("//*[@placeholder='Password']"));   why xpath is not working in robot class
        r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_R);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.quit();
		}
}
