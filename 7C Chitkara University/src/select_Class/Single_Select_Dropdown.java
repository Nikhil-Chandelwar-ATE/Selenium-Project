 package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium/demo.html");
		Thread.sleep(2000);
		
		//Step 1 Create the object of Select class
		WebElement courseDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(courseDD);
		
		//Step 2 Use the methods using reference variable of Select class
		
		//selectByIndex
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByIndex(4);
		Thread.sleep(2000);
		
		//selectByValue
		select.selectByValue("jgr");
		Thread.sleep(2000);
		select.selectByValue("nin");
		
		//selectByVisibleText
		select.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		select.selectByVisibleText("Toyota");
	}

}
