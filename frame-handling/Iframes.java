package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\Downloads\\browser driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);		             //frame index  1st way
		//driver.switchTo().frame("iframeResult");   //frame name          2nd way
		WebElement frame1=driver.findElement(By.id("iframeResult"));        //3rd way
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(500);
		
		
		

	}

}
