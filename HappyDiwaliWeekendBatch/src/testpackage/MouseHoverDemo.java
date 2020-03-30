package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://istqb.in");
		//MouseHover on Foundation.
		Actions action = new Actions(driver);
		WebElement FoundationObj = driver.findElement(By.xpath("//*[text()='FOUNDATION'][1]"));
		action.moveToElement(FoundationObj);






	}

}
