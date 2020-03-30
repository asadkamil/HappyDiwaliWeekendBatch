package testpackage;
public class StaleElementReferenceException extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		/*	WebElement unTB = driver.findElement(By.id("username"));
		unTB.sendKeys("admin 1");
		driver.navigate().refresh();
		unTB.sendKeys("admin 2");*/
		LoginPage lp = new LoginPage(driver);
		//Invalid login scenario
		lp.setUsername("admin 123");
		Thread.sleep(2000);
		lp.setPassword("dgdgdgfgfhf");
		Thread.sleep(2000);
		lp.clickLogin();//page will auto refresh
		Thread.sleep(2000);
		//Valid login scenario
		lp.setUsername("admin");
		Thread.sleep(2000);
		lp.setPassword("manager");
		Thread.sleep(2000);
		lp.clickLogin();
		Thread.sleep(2000);
		driver.quit();
	}
}
