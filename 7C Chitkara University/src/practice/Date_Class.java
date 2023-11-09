package practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Date_Class {

	public static void main(String[] args) throws InterruptedException, IOException {

		Date date = new Date();
		String name = date.toString().replace(" ", "_").replace(":", "_");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement actiTimeLogo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		File src = actiTimeLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+name+".jpeg");
		FileHandler.copy(src, dest);
	}

}
