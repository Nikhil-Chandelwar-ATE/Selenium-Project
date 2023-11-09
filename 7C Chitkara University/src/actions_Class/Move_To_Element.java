package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.linkText("Men's T-Shirts"))).click().perform();
		//Thread.sleep(1000);
		//action.click(driver.findElement(By.linkText("Men's T-Shirts"))).perform();
	}

}
