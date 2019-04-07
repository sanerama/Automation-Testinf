package carsSearch;
	

	import static org.junit.Assert.assertEquals;

	import org.junit.*;
	import org.openqa.selenium.By;

	public class Polymorphism extends BeforeAfter{
		
		
		
		@Test
		public void testToTest()
		{
			String sale,rent;
			sale = "search-tabs-for-sale";
			rent = "search-tabs-to-rent";
			driver.get("https://www.zoopla.co.uk");
			search("London",sale,"for sale");
			search("Birmingham",rent,"to rent");
			search("Manchester",rent,"to rent");
			
		}
		
		public void search(String place, String type, String typetext)
		{
			driver.findElement(By.id(type)).click();
			driver.findElement(By.name("q")).clear();
			driver.findElement(By.name("q")).sendKeys(place);
			driver.findElement(By.id("search-submit")).click();
			assertEquals("Property "+typetext+" in "+place,driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h1")).getText());
			driver.findElement(By.cssSelector("#logo > img")).click();
		}
		
		
	}


