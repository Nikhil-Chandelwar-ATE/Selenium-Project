package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class B {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ele.png");
		FileHandler.copy(src, dest);
	}

}
