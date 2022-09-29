package utilis;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	public static void captureScreen(WebDriver driver,int TestCaseID ) throws IOException {
	
	

	Date currentdate = new Date();
	SimpleDateFormat facebook = new SimpleDateFormat("dd-mm-yy HH mm ss");
     String date=	facebook.format(currentdate);
     System.out.println(date);

     TakesScreenshot take = (TakesScreenshot)driver;

      File src = take.getScreenshotAs(OutputType.FILE);

      File dest = new File ("C:\\Users\\ashwi\\Desktop\\screenshotcapture\\"+date+""+TestCaseID+"test123.jpeg");

      FileHandler.copy(src, dest);

	
	
	}
		
	}


