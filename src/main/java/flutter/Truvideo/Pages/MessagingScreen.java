package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MessagingScreen extends UtilityClass {
	AppiumDriver<WebElement> driver;

	public MessagingScreen(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(accessibility = "Messages")
	@iOSXCUITFindBy(accessibility = "Messages")
	private WebElement message_Title;
	
	public WebElement getMessage_Title() {
		return message_Title;
	}

}
