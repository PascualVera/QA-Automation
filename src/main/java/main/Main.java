package main;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		Driver driver = new Driver();

		driver.exerciseTwo("file:///C:/Users/Pascual.Vera/Downloads/linksrotos.html");

	}

}
