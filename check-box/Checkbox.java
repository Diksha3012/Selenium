package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\Downloads\\browser
		// driver\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.id("interest_market_c0")).click(); // click method to simply check or uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("interest_sell_c0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("interest_serve_c0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("interest_sell_c0")).click(); // again clicking on it will deselect it.

	}

}
