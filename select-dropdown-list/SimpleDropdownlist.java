package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleDropdownlist {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.name("employees_c"));
        Select select =new Select(dropdown);
        select.selectByValue("level6");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByVisibleText("51 - 100 employees");
        Thread.sleep(2000);
        
       
        		
		
		
		
		
		
	}
	
	
	

}