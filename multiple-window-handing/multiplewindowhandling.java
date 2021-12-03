package ui;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindowhandling {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.salesforce.com/in/");
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
	Thread.sleep(4000);
	Set<String> windowhandles = driver.getWindowHandles();
	System.out.println(windowhandles);
	java.util.Iterator<String> iterator = windowhandles.iterator();
	 String parentwindow = iterator.next();
	 String childwindow = iterator.next();
	 driver.switchTo().window(childwindow);
	 driver.findElement(By.name("UserFirstName")).sendKeys("Diksha");
	 driver.findElement(By.name("UserLastName")).sendKeys("Katna");
	 
	 
	
	
	
	
	
	
	}

}
