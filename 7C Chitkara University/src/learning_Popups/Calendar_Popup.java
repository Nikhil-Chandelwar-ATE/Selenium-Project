package learning_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Popup {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		driver.findElement(By.id("first_date_picker")).click();
		Thread.sleep(1000);
		
		while (true) {
			if(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().equals("August 1947")) {
				
				driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(14).click();
				break;
		}
			else {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
				Thread.sleep(500);
			}
		}
	}
}
