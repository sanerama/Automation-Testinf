package carsSearch;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PostCode {
	
	
	
	WebDriver driver;
	@Before
	public void setUP()
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\Automation\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void Test()
	{
		driver.get("https://www.autotrader.co.uk");
		driver.findElement(By.name("postcode")).clear();
		driver.findElement(By.name("postcode")).sendKeys("E143WG");
		driver.findElement(By.id("js-search-button")).click();
		//assertEquals("481,334 cars found", driver.findElement(By.xpath("/html/body/main/section[1]/div[1]/form/div/div/h1")).getText());
		
	}
	
	@After
	public void close()
	{
		
		
		driver.close();
		
	}
	
	
}
