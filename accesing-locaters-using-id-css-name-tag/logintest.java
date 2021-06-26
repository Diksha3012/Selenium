package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("user-name")).sendKeys("standard_user"); // by id
		// driver.findElement(By.name("user-name")).sendKeys("standard_user"); // by name
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user"); // by css selector
		driver.findElement(By.tagName("input")).sendKeys("standard_user"); // by tag name

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		// class name,partial link(anchor tag// 
		driver.close();
		

	}

}