package testpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) throws InterruptedException {
		//set the path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//enter the URL
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		String ParentWH = driver.getWindowHandle();
		System.out.println("Nahkri window handle is: "+ParentWH);
		//print the window handle id and the title of all the browser windows.
		Set<String> allWHs = driver.getWindowHandles();
		System.out.println("Total brwser windows : "+allWHs.size());
		/*	for (String wh : allWHs)
		{
			driver.switchTo().window(wh);
			System.out.println(wh + "--> "+ driver.getTitle());
		}*/
		//close all the broswer windows -- using Iterator() method
		/*	Iterator<String> itr = allWHs.iterator();
		while (itr.hasNext())
		{
			String wh = itr.next();
			driver.switchTo().window(wh);
			driver.quit();
		}*/
		//close only parent window
		/*	for (String wh :  allWHs)
		{
			if (wh.equals(ParentWH))
			{
				driver.close();
			}
		}*/
		//close all child except parent window
		/*for (String wh :  allWHs)
		{
			driver.switchTo().window(wh);
			if (!wh.equals(ParentWH))
			{

				driver.close();
			}
		}	*/

//closing a specific browser
		
		for (String wh : allWHs)
		{
			driver.switchTo().window(wh);
			String actTitle= driver.getTitle();
			if(actTitle.equals("Tech Mahindra") || actTitle.equals("LnT"))
			{
				driver.close();
			}
		}		
	}
}
