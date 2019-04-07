package FMPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject{
	
  static WebDriver driver;
 
 @FindBy(xpath = "//input[@name='userName']")
 WebElement uname ;
 
 @FindBy(xpath = "//input[@name='password']")
 WebElement password;
 
 @FindBy(xpath = "//input[@value='Login']")
 WebElement btn;
 
 public void FMPageObject(WebDriver driver) {
		LoginObject.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

 public void enterUserName() {
	 
	uname.sendKeys("swtrainererp");
	uname.click();
 }

 
 public void enterpsw() {
	 
 }

}
