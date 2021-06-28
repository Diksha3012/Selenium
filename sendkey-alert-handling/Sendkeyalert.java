package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeyalert {

	public static void main(String[] args) throws InterruptedException {

		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.id("iframeResult"));        
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert popup=driver.switchTo().alert();
		popup.sendKeys("katna");
		popup.accept();
		Thread.sleep(300);
		

	}

}
