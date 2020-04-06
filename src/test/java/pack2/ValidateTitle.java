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
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTitle extends Basic {

	public static Logger log =LogManager.getLogger(Basic.class.getName());
  @Test
  public void Homepagenav() throws IOException, InterruptedException {
	driver =initializedriver();
    driver.get(prop.getProperty("URL"));
    log.info("user navigated to site");
    LandingPage lp=new LandingPage(driver);
    Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES1");
    log.info("title is matched");
    System.out.println("Tile is matched");
    driver.close();
    
}}
