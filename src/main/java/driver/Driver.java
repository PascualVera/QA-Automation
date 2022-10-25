package driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	ChromeDriver driver = new ChromeDriver();

	public void navigateTo(String href) {
		driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.className("gb_A")).click();
		driver.findElement(By.xpath("//a[contains(@href," + href + ")]")).click();
	}

	public void exerciseOne() {
		driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("most viewed scienci fiction trailer");
		element.submit();
		List<WebElement> link = driver.findElements(By.className("hdtb-mitem"));
		link.get(1).click();
		List<WebElement> videos = driver.findElements(By.className("MjjYud"));

		videos.get(2).findElement(By.tagName("a")).click();
	}

	public void exerciseTwo(String url) {
		driver.get(url);
		
		List<WebElement> brokenList = driver.findElements(By.tagName("a"));
		for (WebElement element : brokenList) {
			String href =element.getAttribute("href");
			if(href == "") {
				System.out.println(element.getText());
			}
			
		}
	}
	public void wikiShit() {
		driver.get("https://es.wikipedia.org/");
		WebElement element = driver.findElement(By.id("searchInput"));
		element.sendKeys("list of countries by tax revenue as percentage of GDP");
		element.submit();
		driver.findElement(By.className("mw-search-result-heading")).click();
		
		
	}
}
