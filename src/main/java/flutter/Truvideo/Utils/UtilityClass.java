package flutter.Truvideo.Utils;

import java.util.Random;
import java.time.Duration;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import flutter.Truvideo.BaseClass.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class UtilityClass {

	AppiumDriver<WebElement> driver;
	public Logger log = LogManager.getLogger(this.getClass().getName());

	public UtilityClass(AppiumDriver<WebElement> driver) {
		this.driver = driver;
	}

	public String randomWord() {
		Random rnd = new Random();
		int random = rnd.nextInt(999999);
		String generatedName = "Name" + String.valueOf(random);
		return generatedName;
	}

	public int randomNumber() {
		Random rnd = new Random();
		int number = rnd.nextInt(999999999);
		return number;
	}
	


	public void scrollByElementText(WebElement visibleElementName) {
	//	AppiumDriver<WebElement> appiumDriver = (AppiumDriver<WebElement>) driver;
		if(driver instanceof AndroidDriver<?>) {
		String androidUIAutomatorExpression = "new UiScrollable(new UiSelector()).scrollIntoView(WebElement(\""
				+ visibleElementName + "\"));";
		((AndroidDriver<WebElement>) driver).findElementByAndroidUIAutomator(androidUIAutomatorExpression);
		}else
			if(driver instanceof IOSDriver<?>) {
				//scrollCommand = "mobile: scroll";
				HashMap<String, String> scrollObject = new HashMap<String,String>();
				//scrollObject.put("label", visibleElementName);
				//scrollObject.put("direction", "down");
				scrollObject.put("toVisible", "true");
				((IOSDriver<WebElement>) driver).executeScript("mobile: scroll", scrollObject);
			}
	}

	/*
	 * public void scrollDown() { JavascriptExecutor js = (JavascriptExecutor)
	 * driver; HashMap<String, String> scrollObject = new HashMap<String, String>();
	 * scrollObject.put("direction", "down"); js.executeScript("mobile: scroll",
	 * scrollObject); }
	 * 
	 * public void scrollUp() { JavascriptExecutor js = (JavascriptExecutor) driver;
	 * HashMap<String, String> scrollObject = new HashMap<String, String>();
	 * scrollObject.put("direction", "up"); js.executeScript("mobile: scroll",
	 * scrollObject); }
	 */
	

    public void scrollUp(){	
		Dimension dimension = driver.manage().window().getSize();	
		Double scrollHeightEnd = dimension.getHeight() * 0.5;
		int scrollStart = scrollHeightEnd.intValue();
		Double scrollHeightStart = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightStart.intValue();
		new TouchAction((PerformsTouchActions)driver)
		.press(PointOption.point(0, scrollEnd))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(0, scrollStart))
		.release().perform();	
	}
    
    public void scrollDown(){
		Dimension dimension = driver.manage().window().getSize();
		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();
		new TouchAction(driver)
		.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
}
 

}
