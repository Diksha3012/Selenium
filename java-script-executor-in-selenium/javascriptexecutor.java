
package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//print the title of page
		String script = "return document.title;";
		String title = (String) jse.executeScript(script);
		System.out.println(title);
		
		//click button
		
		driver.switchTo().frame("iframeResult");	          
		jse.executeScript("myFunction()");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();     
		
		//Highlight the try button
		WebElement button= driver.findElement(By.xpath("/html/body/button"));		
		jse.executeScript("arguments[0].style.border='5px solid red'" , button);
		
	}

}
