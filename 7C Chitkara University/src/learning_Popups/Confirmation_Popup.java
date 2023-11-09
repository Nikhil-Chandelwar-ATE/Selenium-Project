package learning_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		confirmAlert.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Text of the alert : "+alert.getText());
		Thread.sleep(2000);
		alert.accept();
		WebElement result = driver.findElement(By.id("result"));
		System.out.println("Text : "+result.getText());
		Thread.sleep(2000);
		
		confirmAlert.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		WebElement result2 = driver.findElement(By.id("result"));
		System.out.println("Text : "+result2.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
