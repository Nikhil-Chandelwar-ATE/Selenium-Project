package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Stale_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("BOOKS")).click();
		Thread.sleep(2000);
		WebElement positionDD = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(positionDD);
		
		for (int i = 1; i < sel.getOptions().size(); i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);
			sel = new Select(driver.findElement(By.id("products-orderby")));
		}
	}

}
