package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("newWindowBtn")).click();
		String pID = driver.getWindowHandle();
		Set<String> cID = driver.getWindowHandles();
		
		cID.remove(pID);
		for (String string : cID) {
			driver.switchTo().window(string);
			driver.close();
		}
		driver.switchTo().window(pID);
		driver.findElement(By.id("name")).sendKeys("aman");
	}
}
