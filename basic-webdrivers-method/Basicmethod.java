package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicmethod {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String title = driver.getTitle();
		System.out.println(title);
		String source = driver.getPageSource();
		System.out.println(source);
		driver.navigate().to("https://www.google.co.in");
		driver.close();

	}

}
