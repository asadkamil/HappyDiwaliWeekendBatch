package testpackage;
import java.util.Set;
import org.openqa.selenium.By;

public class FileUploadDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();		
		String ParentWH = driver.getWindowHandle();
		System.out.println(ParentWH);
		Set<String> allWHs = driver.getWindowHandles();
		System.out.println(allWHs);
		System.out.println(allWHs.size());
		for(String wh : allWHs)
		{
			driver.switchTo().window(wh);

			if (!ParentWH.equals(wh))
			{
				driver.close();
			}
		}
		driver.switchTo().window(ParentWH);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input_resumeParser']"));
		driver.quit();
	}
}
