package javaScriptExecutor_Interface;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_By {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windw.scrollBy(0,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)");
	}

}
