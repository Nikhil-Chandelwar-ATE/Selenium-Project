package working_With_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		int x = driver.manage().window().getPosition().getX();
		System.out.println(x);
		int y = driver.manage().window().getPosition().getY();
		System.out.println(y);
		driver.quit();
	}

}
