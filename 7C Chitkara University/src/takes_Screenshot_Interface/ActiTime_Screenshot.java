package takes_Screenshot_Interface;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ActiTime_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		Date date = new Date();
		String newDate = date.toString().replace(' ', '_').replace(':', '_');
		
		//Typecasting driver control to TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Used to take the screenshot and store in RAM/Local memory
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Setting the path, where we want to store the screenshot
		File dest = new File("./screenshots/"+newDate+".png");
		
		//Copying screenshot from RAM to system memory
		FileHandler.copy(src, dest);
		
	}

}
