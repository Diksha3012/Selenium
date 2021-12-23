package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");	  
	List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));	
	System.out.println("No of columnsrows are:" +col.size());
	List<WebElement> totalcells = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td"));	
	System.out.println("No of cells are:" +totalcells.size());
	List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));	
	System.out.println("No of rows are:" +rows.size());
	
	
	
	
	
			
		
		}

	}


