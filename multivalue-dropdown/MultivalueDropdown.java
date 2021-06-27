package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultivalueDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement multivalue=driver.findElement(By.id("multi-select"));
		Select select= new Select(multivalue);
		select.selectByValue("Florida");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		java.util.List<WebElement> allitem=select.getAllSelectedOptions();
		System.out.println(allitem.size());
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
		select.selectByValue("Ohio");
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.deselectByIndex(1);
		Thread.sleep(2000);
		java.util.List<WebElement> allitem1=select.getAllSelectedOptions();
		System.out.println(allitem1.size());
        
       
        		
		
		
		
		
		
	}
	
	
	

}