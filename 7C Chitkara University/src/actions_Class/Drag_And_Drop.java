package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destinaton = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, destinaton).perform();
		//http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
	}

}
