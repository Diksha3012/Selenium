package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestiondropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();  //span class made into smaller one by text inside this
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));   //made smaller by attribute
		from.sendKeys("Mumbai");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
	    from.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);

	}

}