package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).perform();
		act.click(driver.findElement(By.linkText("Men's T-Shirts"))).perform();
		
	}
}
