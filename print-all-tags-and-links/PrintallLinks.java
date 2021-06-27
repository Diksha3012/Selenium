package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintallLinks {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		java.util.List<WebElement> alltags=driver.findElementsByTagName("a");
		System.out.println("Total tags are: " +alltags.size());
		
				
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("Links on page are:  " +alltags.get(i).getAttribute("href"));
			System.out.println("Links on page are:  " +alltags.get(i).getText());
		}
		
			


	}

}
