package window_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium/MultipleWindow.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		allWindowID.remove(parentWindowID);
		
		
		System.out.println(parentWindowID);
		System.out.println("================================");
		
		for (String windowID : allWindowID) {
			driver.switchTo().window(windowID);
			Thread.sleep(2000);
			driver.close();
		}
		
	}

}
