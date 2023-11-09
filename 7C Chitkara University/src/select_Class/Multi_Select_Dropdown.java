package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium/demo.html");
		Thread.sleep(2000);
		
		//Step 1 Create the object of Select class
		WebElement carsDD = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(carsDD);
		
		sel.selectByVisibleText("Honda");
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		sel.deselectAll();
		
//		sel.deselectByIndex(1);
//		Thread.sleep(2000);
//
//		sel.deselectByValue("hda");
//		Thread.sleep(2000);
//		
//		sel.deselectByVisibleText("Land Rover");
	}

}
