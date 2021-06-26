package ui;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // import io.github.bonigarcia.wdm.WebDriverManager;

		ChromeDriver driver = new ChromeDriver(); // import org.openqa.selenium.chrome.ChromeDriver;

		//driver.get("https://www.selenium.dev/docs");
		// driver.findElement(By.linkText("Documentation")).click(); // with anchor tag link 
		//driver.findElement(By.cssSelector("#navbar > a:nth-child(5)")).click();
		driver.get("https://www.selenium.dev/documentation/en/webdriver/locating_elements/");
		//driver.findElement(By.linkText("WebDriver Bidi APIs")).click();  //with anchor tag link tag
		driver.findElement(By.partialLinkText("Bidi")).click();  // with anchor tag partia link
		
		
		

	}

}
