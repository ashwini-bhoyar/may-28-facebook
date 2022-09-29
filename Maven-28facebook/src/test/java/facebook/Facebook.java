package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	
	public static void main(String[] args) {
		
	
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openMessenger();
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.openRoom();
		
		RoomPage roomPage = new RoomPage(driver);
		roomPage.contactToHelpCenter();
		
		System.out.println("hiii");
		
		
		
		
		
		
	}

}
