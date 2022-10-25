package driver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	ChromeDriver driver = new ChromeDriver();

	public void openJL() {

		WebDriverManager.chromedriver().setup();
		driver.get("https://google.com");

	}
}
