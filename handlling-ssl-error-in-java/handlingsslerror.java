package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;


public class handlingsslerror {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Create instance of ChromeOptions Class
				ChromeOptions handlingSSL = new ChromeOptions();

				//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
				handlingSSL.setAcceptInsecureCerts(true);
						
				//Creating instance of Chrome driver by passing reference of ChromeOptions object
				WebDriver driver = new ChromeDriver(handlingSSL);
				
				//Launching the URL
				driver.get("https://expired.badssl.com/");
				Thread.sleep(2000);
				System.out.println("The page title is : " +driver.getTitle());
				Thread.sleep(2000);
				
		
	
		
	}

}
