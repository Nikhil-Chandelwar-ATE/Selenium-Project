package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(ele1).perform();
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Copy']"));
		action.click(ele2).perform();
	}
}
