package carsSearch;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfter {
	WebDriver driver;
	@Before
	public void setUp()
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Automation\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	
	@After
	public void close()
	{
		
		driver.close();
	}
}
