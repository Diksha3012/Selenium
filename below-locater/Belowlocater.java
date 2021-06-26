package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class Belowlocater {
	
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

		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement name = driver.findElement(By.id("user-name"));
	    driver.findElement(withTagName("input").below(name)).sendKeys("secret_sauce");
		

	}

}

