package flutter.Truvideo.BaseClass;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import flutter.Truvideo.Utils.CapabilityReader;
import io.appium.java_client.AppiumDriver;

public class BaseClass {

public static AppiumDriver<WebElement> driver;
	
	public Logger log = LogManager.getLogger(this.getClass().getName());
	 
	public AppiumDriver<WebElement> setUpApplication()  {

		String capsContentRootLocation="./Capabilities.json";
		try {
			driver = new AppiumDriver<WebElement>(CapabilityReader.getDesiredCapabilities("Samsung S21 5G", capsContentRootLocation));
		} catch (Exception e) {
			log.info("Error in Reading Capabilities from Json File ");
			e.printStackTrace();
		}
		driver.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Connected to Appium Server, Launching Application. . .");
		
		return driver;
	}
}
