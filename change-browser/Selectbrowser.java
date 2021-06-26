package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectbrowser {

	public static String browser = "Firefox";  //External Configuration
	
	public static FirefoxDriver driver;

	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();

			 driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();

		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("******");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		driver.close();

	}

}
