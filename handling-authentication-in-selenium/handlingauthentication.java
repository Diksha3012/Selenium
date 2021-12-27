package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingauthentication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
		//https://admin:admin@the-internet.herokuapp.com/basic_auth" use this url directly instead 
		//https://the-internet.herokuapp.com/basic_auth becoz here we are putting username and password directly into the url
	}

}
