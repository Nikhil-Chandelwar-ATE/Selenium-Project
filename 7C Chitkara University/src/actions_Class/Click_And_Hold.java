package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement ele1 = driver.findElement(By.name("E"));
		WebElement ele2 = driver.findElement(By.name("L"));
		action.clickAndHold(ele1).moveToElement(ele2).release(ele1).build().perform();
	}

}
