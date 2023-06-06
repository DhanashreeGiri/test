package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class VideoRecordingPage extends UtilityClass{
	AppiumDriver<WebElement> driver;
	
	public VideoRecordingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Rotate your device Left or Right")
	 @iOSXCUITFindBy(accessibility = "Rotate your device Left or Right" )
	private WebElement rotateDeviceMessage;
	
	public WebElement getRotateDeviceMessage() {
		return rotateDeviceMessage;
	}

}