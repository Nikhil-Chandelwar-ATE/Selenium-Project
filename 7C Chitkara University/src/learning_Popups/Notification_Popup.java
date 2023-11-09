package learning_Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {

	public static void main(String[] args) {

		//Create object of chrome options class
		ChromeOptions option = new ChromeOptions();
		
		//call the addArguments() method
		option.addArguments("--disable-notifications");
		
		//pass the option variable into chromDriver
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

}
