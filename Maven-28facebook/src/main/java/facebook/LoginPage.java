package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	

	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement name ;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@value='1']")
	private WebElement LogIn ;
	
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement createNewAccount ;
	
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement messengerLink ;

	

	
	
    public LoginPage (WebDriver driver ) {
		
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	
	}
  //use
    public void sendname() {
    	name.sendKeys("meena bhoyar");
    }
    public void sendpassword() {
    	password.sendKeys("ashu1997");
    }
    public void clicklogin() {
    	LogIn.click();
    }
    public void clickonCreateNewAcc() {
    	createNewAccount.click();
    }


    public void openMessenger() {
    	messengerLink.click();
    }
	
   
	

		//public void LoginFacebook() {
			
			
			//name.sendKeys("meena bhoyar");	
			//password.sendKeys("ashu1997");
			//LogIn.click();

}

		

			
		

		


