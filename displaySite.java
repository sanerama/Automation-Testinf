package zoopla;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class displaySite {
	
	public static WebDriver driver;
	
	@Test
	public void setUP() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\AUTOMATION TESTING\\JarFiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.zoopla.co.uk/");
	driver.close();
	}
}
