package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RO_SettingPage extends UtilityClass {
	AppiumDriver<WebElement> driver;
	
	public RO_SettingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	private WebElement profileIcon;
	
	@AndroidFindBy(accessibility = "Settings")
	private WebElement settings;
	
	@AndroidFindBy(xpath = "//android.view.View[@index=\"1\"][@clickable=\"true\"]")
	//@iOSXCUITFindBy(xpath="//*[@type='XCUIElementTypeStaticText'][2]")
	private WebElement fontSize;
	
	@AndroidFindBy(accessibility = "Small")
	private WebElement smallFont;
	
	@AndroidFindBy(accessibility = "Medium")
	private WebElement mediumFont;
	
	@AndroidFindBy(accessibility = "Large")
	private WebElement largeFont;
	
	public void checkSmallFont() throws InterruptedException {
		Thread.sleep(6000);
		profileIcon.click();
		log.info("Clicked on profile icon");
		Thread.sleep(2000);
		settings.click();
		fontSize.click();
		smallFont.click();
		
			
		
	}

}
