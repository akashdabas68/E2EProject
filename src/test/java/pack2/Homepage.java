package pack2;
import pack11.*;

import pages.LandingPage;
import pages.LoginPage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Homepage extends Basic {
	public static Logger log =LogManager.getLogger(Basic.class.getName());
  @Test
  public void Homepagenav() throws IOException, InterruptedException {
	driver =initializedriver();
	driver.get("http://www.qaclickacademy.com/");
	log.info("User is on site");
	//driver.manage().window().maximize();
	
  LandingPage lp=new LandingPage(driver);
  lp.loginbutton().click();;
  log.info("User clicked on login button");
  LoginPage ln=new LoginPage(driver);
  ln.callUsername().sendKeys("abcd@mdm.com");
  log.info("User entered username");
  ln.callPassword().sendKeys("xyz");
  log.info("User entered password");
  ln.callloginbtn().click();
  log.info("User clicked on login button");
  
}}
