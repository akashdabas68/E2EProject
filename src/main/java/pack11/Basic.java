package pack11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public WebDriver driver;
    public Properties prop;
	public WebDriver initializedriver() throws IOException {

		 prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\E2EProject\\src\\test\\resources\\Data.properties");

		prop.load(fis);

		String browser = prop.getProperty("Browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getscreenshots() throws IOException {
	     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("D:\\test\\screenshot.png"));
	 	
	}
}
