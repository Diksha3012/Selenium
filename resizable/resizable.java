package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
				
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/resizable/");
			driver.manage().window().maximize();
			WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			driver.switchTo().frame(frame1);
			Thread.sleep(4000);
			WebElement drag= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
			Actions action = new Actions(driver);
			action.dragAndDropBy(drag, 100, 100).perform();

	}

}
