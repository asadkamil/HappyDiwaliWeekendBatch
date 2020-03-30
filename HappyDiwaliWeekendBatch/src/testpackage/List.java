package testpackage;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class List extends BaseClass {
	public static void main(String[] args) {
		driver.get("file:///C:/Users/Er.%20Asad%20Kamil/Desktop/Breakfast.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	//not working ?
		WebElement ListObj = driver.findElement(By.id("mtr"));
		Select s = new Select(ListObj);
		System.out.println(s.isMultiple());
		System.out.println(s.getOptions().size());
		/*java.util.List<WebElement> All_options = s.getOptions();
		for (WebElement option : All_options)
		{
			System.out.println(option.getText());
		}*/
		Iterator<WebElement> iterator3 = s.getOptions().iterator();
		while(iterator3.hasNext())
		{
			WebElement next = iterator3.next();
			System.out.println(next.getText());
		}
		s.selectByIndex(0);
		s.selectByVisibleText("DOSA");
		s.selectByValue("v");
		System.out.println(s.getAllSelectedOptions().size());
		// printing all selected using iterator
		Iterator<WebElement> iterator = s.getAllSelectedOptions().iterator();
		while(iterator.hasNext())
		{
			WebElement next = iterator.next();
			System.out.println(next.getText());
		}
		//deselect
		s.deselectByValue("d");
		/*		System.out.println(s.getAllSelectedOptions().size());
		Iterator<WebElement> iterator2 = s.getAllSelectedOptions().iterator();
		while(iterator2.hasNext()) {
			WebElement next = iterator2.next();
			System.out.println(next.getText());
		}*/
		/*	Iterator<WebElement> iterator2 = s.getAllSelectedOptions().iterator();
		while(iterator2.hasNext())
		{
			WebElement next = iterator2.next();
			System.out.println(next.getText());
		}*/

		/*        for(WebElement option : s.getAllSelectedOptions())
        {
        	System.out.println(option.getText());
        }*/

		for (WebElement option : s.getAllSelectedOptions())
		{
			System.out.println(option.getText());
		}
		Iterator<WebElement> iterator2 = s.getAllSelectedOptions().iterator();
		while (iterator2.hasNext())
		{
			WebElement next = iterator2.next();
			System.out.println(next.getText());
		}
		driver.quit();
	}
}