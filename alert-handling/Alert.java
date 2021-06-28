package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\Downloads\\browser driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);		           
		
	
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();                              //handling alert
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		Thread.sleep(500);
		
		
		
		

	}

}
