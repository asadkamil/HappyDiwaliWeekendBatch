package testpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class TargetLocatorActiveElement extends BaseClass {
	public static void main(String[] args) throws InterruptedException  {
		driver.get("Https://www.google.com");
		driver.switchTo().activeElement().sendKeys("goa beaches"); //method chaining
		/*TargetLocator tl = driver.switchTo();
		WebElement googleSrcTB = tl.activeElement();
		googleSrcTB.sendKeys("goa beaches");*/
		Thread.sleep( 3000);
		//select goa beaches images if exists.
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//*[contains(text(),'goa beach')]"));
		int totalSuggestions = allSuggestions.size();
		System.out.println(totalSuggestions);
		System.out.println(allSuggestions);
		for (WebElement suggestion : allSuggestions)
		{
			String text = suggestion.getText();
			System.out.println(text);
			if (text.equals("goa beaches images"))
			{
				suggestion.click();	
				break;
			}
		}
		driver.quit();
	}
}