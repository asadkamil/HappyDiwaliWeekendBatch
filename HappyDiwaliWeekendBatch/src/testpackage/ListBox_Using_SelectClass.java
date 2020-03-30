package testpackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ListBox_Using_SelectClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Er.%20Asad%20Kamil/Desktop/Breakfast.html");
		//check whether the list box is single select or multi select.
		WebElement listObjects = driver.findElement(By.id("mtr"));
		Select s = new Select(listObjects);
		boolean multiple = s.isMultiple();
		if (multiple)
		{
			System.out.println("List box is multi select....");			
		}
		else 
		{
			System.out.println("List box is single select...");
		}
		//print the total number of options in the list.
		List<WebElement> All_options = s.getOptions();
		System.out.println("Total options in the list is :"+All_options.size());
		System.out.println("Options are below...");
		for (WebElement option : All_options)
		{
			System.out.println(option.getText());
		}
		//select IDLY using index
		s.selectByIndex(0);
		Thread.sleep(2000);
		//select DOSA by Value.
		s.selectByValue("d");
		Thread.sleep(2000);
		//select Poori using visible text.
		s.selectByVisibleText("POORI");
		Thread.sleep(5000);
		System.out.println("Total selected options are "+s.getAllSelectedOptions().size());
		System.out.println("selected options are below...");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		Iterator<WebElement> iterator = allSelectedOptions.iterator();
		while (iterator.hasNext())
		{
			WebElement single_option = iterator.next();
			System.out.println(single_option.getText());
		}
		driver.quit();
	}
}