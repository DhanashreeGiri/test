package flutter.Truvideo.BaseClass;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import flutter.Truvideo.Utils.AppConfig;
import flutter.Truvideo.Utils.CapabilityReader;
import io.appium.java_client.AppiumDriver;

public class BaseClass {

public static AppiumDriver<WebElement> driver;
	
	public Logger log = LogManager.getLogger(this.getClass().getName());
		
	@BeforeSuite
	public AppiumDriver<WebElement> setUpApplication()  {
		String capabilityName= AppConfig.capabilityName;
		String capsContentRootLocation="./Capabilities.json";
		System.out.println(capabilityName);
		try {
			driver = new AppiumDriver<WebElement>(CapabilityReader.getDesiredCapabilities(capabilityName, capsContentRootLocation));
		} catch (Exception e) {
			log.info("Error in Reading Capabilities from Json File ");
			e.printStackTrace();
		}
		driver.launchApp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Connected to Appium Server, Launching Application. . .");
		
		return driver;
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
