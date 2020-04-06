package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(id="user_email")
	 //WebElement Username;
	By Username=By.id("user_email");
	By password= By.id("user_password");
	By loginbt = By.xpath("//input[@name='commit']");
	
	public WebElement callUsername() {
		return driver.findElement(Username);
	}

	public WebElement callPassword() {
		return driver.findElement(password);
	}
 
	public WebElement callloginbtn() {
		return driver.findElement(loginbt);
	}
}
