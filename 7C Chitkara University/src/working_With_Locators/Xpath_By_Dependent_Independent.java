package working_With_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Dependent_Independent {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../../..//div[contains(@class,'_WHN')]")).getText();
		System.out.println(price);
	}

}
