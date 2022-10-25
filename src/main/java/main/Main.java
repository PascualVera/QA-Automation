package main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		Driver driver = new Driver();

	}

}
