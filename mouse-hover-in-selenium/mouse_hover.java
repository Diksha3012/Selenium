package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class mouse_hover {


			public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
				
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			WebElement element= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			
			}

		}

	


