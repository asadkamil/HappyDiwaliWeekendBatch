package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declare the elements
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	
	//intialise the elements
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Utilisation of elements
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pwd){
		pwdTB.sendKeys(pwd);
	}
	
	public void clickLogin(){
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//utilsie the elements
	
	
	

}
