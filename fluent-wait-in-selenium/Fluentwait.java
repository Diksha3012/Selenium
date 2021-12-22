package ui;
import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");	  			
			WebElement element= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			Wait<WebDriver> explicitwait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(20))
				       .pollingEvery(Duration.ofSeconds(2))
				       .ignoring(NoSuchElementException.class)     
	     		         
				       .withMessage("Lets check fluent wait in selenium");				       
				     
				       
				       explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[7]/a"))).click();	
					  
			    
	}

		
}
