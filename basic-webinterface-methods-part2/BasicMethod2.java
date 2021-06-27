
package ui;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BasicMethod2 

{
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//WebElement uname=driver.findElement(By.id("user-name"));
		//uname.sendKeys("standard_user");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  //findElement
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		
		java.util.List<WebElement> webelements= driver.findElements(By.xpath("//*[@class=\"inventory_list\"]/div"));
		
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com");
		String winhandle=driver.getWindowHandle();
		System.out.println(winhandle);
		driver.findElement(By.xpath("/html/body/div[3]/header/div/div/nav/div[1]/ul/li[10]/a/span")).click();   //  write \"main\" like this if main appear in black rather blue
		Set<String> winhand=driver.getWindowHandles();
		System.out.println(winhand);
		driver.quit();
	}

}

