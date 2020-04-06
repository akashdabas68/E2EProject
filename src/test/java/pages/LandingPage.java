package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPage {
WebDriver driver;
public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
PageFactory.initElements(driver, this);
	
}



 @FindBy(xpath="//*[text()='Featured Courses']")
 WebElement Title;
By loginbtn=By.cssSelector("a[href*='sign_in']");
By popup= By.xpath("//button[text()='NO THANKS']");


 
 
 public WebElement loginbutton() {
		 
return driver.findElement(loginbtn);

 }
 

 public WebElement getTitle() {
		 
return Title;

 }
 public WebElement getpopupsize() {
	 return driver.findElement(popup);
 }
 
 public List<WebElement> getpopup() {
	 return driver.findElements(popup);
 }
 
 
}
