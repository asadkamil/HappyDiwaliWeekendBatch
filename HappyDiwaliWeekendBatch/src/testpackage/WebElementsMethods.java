package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class WebElementsMethods{

	public static void main(String[] args) throws InterruptedException {
		//set the path of chrome driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//click on Login Button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		//verify that error message is displayed or not?
		WebElement ErrMsgObj = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		boolean displayed = ErrMsgObj.isDisplayed();
		if (displayed)
		{
			System.out.println("Error message is displayed...");
			//Verify that error message text is correct or not?
			String actErrMsgText = ErrMsgObj.getText();
			String expErrMsgText = "Username or Password is invalid. Please try again.";
			if (actErrMsgText.equals(expErrMsgText))
			{
				System.out.println("Correct error message is displayed");
			}
			else {
				System.out.println("Different message is displayed");
			}
			//Verify the color of the error message is in RED.
			String actColorCode = ErrMsgObj.getCssValue("color");
			System.out.println("Actual string format of initial color code is : "+ actColorCode);
			String HexColorCode = Color.fromString(actColorCode).asHex();
			System.out.println("The final hexa format of color code : "+HexColorCode);
			if (HexColorCode.equals("#ce0100")) 
			{
				System.out.println("Valid color: RED");
			}
			else 
			{
				System.out.println("Invalid color");
			}
		}
		else
		{
			System.out.println("Error message is not displayed");
		}
		driver.close();
	}
}