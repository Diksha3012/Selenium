package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
				
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			driver.switchTo().frame(frame1);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			WebElement drag= driver.findElement(By.id("draggable"));
			WebElement drop =driver.findElement(By.id("droppable"));
			Actions action = new Actions(driver);
			action.dragAndDrop(drag, drop).perform();
			
			}

		}


	


